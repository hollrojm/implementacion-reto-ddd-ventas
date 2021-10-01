package co.com.sofkau.implemetacionretoddd.domain.producto.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofkau.implemetacionretoddd.domain.producto.entities.Empaque;
import co.com.sofkau.implemetacionretoddd.domain.producto.values.EmpaqueId;
import co.com.sofkau.implemetacionretoddd.domain.producto.values.ProductoId;
import co.com.sofkau.implemetacionretoddd.domain.producto.values.TipoEmpaque;

public final class TipoEmpaqueModificado extends DomainEvent {

    private EmpaqueId empaqueId;
    private TipoEmpaque tipoEmpaque;

    public TipoEmpaqueModificado(EmpaqueId empaqueId, TipoEmpaque tipoEmpaque) {
        super("almacenropa.producto.tipoempaqueactualizado");
        this.empaqueId = empaqueId;
        this.tipoEmpaque = tipoEmpaque;
    }

    public EmpaqueId getEmpaqueId() {
        return empaqueId;
    }

    public TipoEmpaque getTipoEmpaque() {
        return tipoEmpaque;
    }
}
