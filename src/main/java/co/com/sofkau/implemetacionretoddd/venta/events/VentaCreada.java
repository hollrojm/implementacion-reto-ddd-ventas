package co.com.sofkau.implemetacionretoddd.venta.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofkau.implemetacionretoddd.producto.entities.Producto;
import co.com.sofkau.implemetacionretoddd.venta.entities.Factura;
import co.com.sofkau.implemetacionretoddd.venta.entities.Sucursal;
import co.com.sofkau.implemetacionretoddd.venta.values.Cantidad;
import co.com.sofkau.implemetacionretoddd.venta.values.Descuento;


import java.util.Set;

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
