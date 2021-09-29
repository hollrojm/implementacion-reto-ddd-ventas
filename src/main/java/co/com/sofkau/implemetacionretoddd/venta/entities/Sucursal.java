package co.com.sofkau.implemetacionretoddd.venta.entities;

import co.com.sofka.domain.generic.Entity;
import co.com.sofkau.implemetacionretoddd.venta.values.SucursalId;

public final class Sucursal extends Entity<SucursalId> {
    public Sucursal(SucursalId entityId) {
        super(entityId);
    }
}
