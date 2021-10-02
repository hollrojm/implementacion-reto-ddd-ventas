package co.com.sofkau.implemetacionretoddd.domain.venta.events;

import co.com.sofka.domain.generic.DomainEvent;

public final class DescuentoPorCompraSuperiorA extends DomainEvent {
    private final Float descuento;

    public DescuentoPorCompraSuperiorA(Float descuento) {
        super("almacenRopa.VentaProducto.descuentoPorCompraSuperiorA");
        this.descuento = descuento;
    }

    public Float getDescuento() {
        return descuento;
    }
}
