package co.com.sofkau.implemetacionretoddd.domain.venta.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofkau.implemetacionretoddd.domain.venta.values.Cantidad;
import co.com.sofkau.implemetacionretoddd.domain.venta.values.Descuento;

public final class VentaCreada extends DomainEvent {

    //Envia objetos de valor de venta
    protected Descuento descuento;
    protected Cantidad cantidad;



    //No pasar entidades
    public VentaCreada(Descuento descuento, Cantidad cantidad) {
        super("almacenropa.venta.ventacreada");

        this.descuento = descuento;
        this.cantidad = cantidad;

    }

    public Descuento getDescuento() {
        return descuento;
    }

    public Cantidad getCantidad() {
        return cantidad;
    }
}
