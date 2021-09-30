package co.com.sofkau.implemetacionretoddd.domain.venta.events;

import co.com.sofka.domain.generic.DomainEvent;

import co.com.sofkau.implemetacionretoddd.domain.venta.values.Descuento;
import co.com.sofkau.implemetacionretoddd.domain.venta.values.FacturaId;

public final class DescuentoModificado extends DomainEvent {

    private final FacturaId facturaId;
    private final Descuento descuento;

    public DescuentoModificado(FacturaId facturaId, Descuento descuento) {
        super("almacenropa.venta.descuentomodificado");
        this.facturaId = facturaId;
        this.descuento = descuento;
    }

    public FacturaId getFacturaId() {
        return facturaId;
    }

    public Descuento getDescuento() {
        return descuento;
    }
}
