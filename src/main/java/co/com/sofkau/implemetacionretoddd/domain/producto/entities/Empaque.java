package co.com.sofkau.implemetacionretoddd.domain.producto.entities;

import co.com.sofka.domain.generic.Entity;
import co.com.sofkau.implemetacionretoddd.domain.producto.values.EmpaqueId;
import co.com.sofkau.implemetacionretoddd.domain.producto.values.TipoEmpaque;

import java.util.Objects;

public final class Empaque extends Entity<EmpaqueId> {


    protected TipoEmpaque tipoEmpaque;

    public Empaque(EmpaqueId entityId, TipoEmpaque tipoEmpaque) {
        super(entityId);
        this.tipoEmpaque = tipoEmpaque;
    }

    public void actualizarTipoEmpaque(TipoEmpaque tipoEmpaque ){
        this.tipoEmpaque = Objects.requireNonNull(tipoEmpaque);
    }

    public TipoEmpaque getTipoEmpaque() {
        return tipoEmpaque;
    }
}
