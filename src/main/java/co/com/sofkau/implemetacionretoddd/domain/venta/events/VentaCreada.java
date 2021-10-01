package co.com.sofkau.implemetacionretoddd.domain.venta.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofkau.implemetacionretoddd.domain.venta.values.Cantidad;
import co.com.sofkau.implemetacionretoddd.domain.venta.values.Descuento;
import co.com.sofkau.implemetacionretoddd.domain.venta.values.VentaId;

public final class VentaCreada extends DomainEvent {

    //Envia objetos de valor de venta
    protected VentaId ventaId;
    protected Descuento descuento;
    protected Cantidad cantidad;



    //No pasar entidades
    public VentaCreada(VentaId ventaId,Descuento descuento, Cantidad cantidad) {
        super("almacenropa.venta.ventacreada");
        this.ventaId = ventaId;
        this.descuento = descuento;
        this.cantidad = cantidad;

    }

    public VentaId getVentaId() {
        return ventaId;
    }

    public Descuento getDescuento() {
        return descuento;
    }

    public Cantidad getCantidad() {
        return cantidad;
    }
}
