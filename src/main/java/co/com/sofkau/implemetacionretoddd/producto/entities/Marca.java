package co.com.sofkau.implemetacionretoddd.producto.entities;

import co.com.sofka.domain.generic.Entity;
import co.com.sofkau.implemetacionretoddd.producto.values.MarcaId;

public final class Marca extends Entity<MarcaId> {



    public Marca(MarcaId entityId) {
        super(entityId);
    }
}
