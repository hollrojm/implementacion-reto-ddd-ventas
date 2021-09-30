package co.com.sofkau.implemetacionretoddd.domain.producto.entities;

import co.com.sofka.domain.generic.Entity;
import co.com.sofkau.implemetacionretoddd.domain.producto.values.EmpaqueId;

public final class Empaque extends Entity<EmpaqueId> {



    public Empaque(EmpaqueId entityId) {
        super(entityId);
    }
}
