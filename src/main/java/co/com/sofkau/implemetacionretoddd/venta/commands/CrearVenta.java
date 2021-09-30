package co.com.sofkau.implemetacionretoddd.venta.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofkau.implemetacionretoddd.venta.values.Cantidad;
import co.com.sofkau.implemetacionretoddd.venta.values.Descuento;
import co.com.sofkau.implemetacionretoddd.venta.values.VentaId;

public final class CrearVenta implements Command {


    protected VentaId ventaId;
    protected Descuento descuento;
    protected Cantidad cantidad;


    public CrearVenta(VentaId ventaId, Descuento descuento, Cantidad cantidad) {


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
