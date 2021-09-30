package co.com.sofkau.implemetacionretoddd.domain.venta.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofkau.implemetacionretoddd.domain.venta.values.Cantidad;
import co.com.sofkau.implemetacionretoddd.domain.venta.values.FacturaId;

public final class CantidadModificada extends DomainEvent {

    private final FacturaId facturaId;
    private final Cantidad cantidad;

    public CantidadModificada(FacturaId facturaId, Cantidad cantidad) {
        super("almacenropa.venta.cantidadmodificada");
        this.facturaId = facturaId;
        this.cantidad = cantidad;
    }

    public FacturaId getFacturaId() {
        return facturaId;
    }

    public Cantidad getCantidad() {
        return cantidad;
    }
}
