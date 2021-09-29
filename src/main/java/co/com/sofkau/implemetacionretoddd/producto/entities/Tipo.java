package co.com.sofkau.implemetacionretoddd.producto.entities;

import co.com.sofka.domain.generic.Entity;
import co.com.sofkau.implemetacionretoddd.producto.values.TipoId;

public final class Tipo extends Entity<TipoId> {

    public Tipo(TipoId entityId) {
        super(entityId);
    }
}
