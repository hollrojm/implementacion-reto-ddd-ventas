package co.com.sofkau.implemetacionretoddd.venta.entities;

import co.com.sofka.domain.generic.Entity;
import co.com.sofkau.implemetacionretoddd.venta.values.VendedorId;

public final class Vendedor extends Entity<VendedorId> {
    public Vendedor(VendedorId entityId) {
        super(entityId);
    }
}
