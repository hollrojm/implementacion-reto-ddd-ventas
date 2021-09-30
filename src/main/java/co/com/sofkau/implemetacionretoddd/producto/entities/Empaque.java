package co.com.sofkau.implemetacionretoddd.producto.entities;

import co.com.sofka.domain.generic.Entity;
import co.com.sofkau.implemetacionretoddd.producto.values.EmpaqueId;

public final class Empaque extends Entity<EmpaqueId> {



    public Empaque(EmpaqueId entityId) {
        super(entityId);
    }
}
