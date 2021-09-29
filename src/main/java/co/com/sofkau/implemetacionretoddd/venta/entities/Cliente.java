package co.com.sofkau.implemetacionretoddd.venta.entities;

import co.com.sofka.domain.generic.Entity;
import co.com.sofkau.implemetacionretoddd.venta.values.ClienteId;

public final class Cliente extends Entity<ClienteId> {
    public Cliente(ClienteId entityId) {
        super(entityId);
    }
}
