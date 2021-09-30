package co.com.sofkau.implemetacionretoddd.venta.entities;

import co.com.sofka.domain.generic.Entity;
import co.com.sofkau.implemetacionretoddd.venta.values.FacturaId;

public final class Factura extends Entity<FacturaId> {
    public Factura(FacturaId entityId) {
        super(entityId);
    }
}
