package co.com.sofkau.implemetacionretoddd.venta.entities;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofkau.implemetacionretoddd.venta.values.VentaId;

public final class Venta extends AggregateEvent<VentaId> {
    public Venta(VentaId entityId) {
        super(entityId);
    }
}
