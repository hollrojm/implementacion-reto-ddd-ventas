package co.com.sofkau.implemetacionretoddd.domain.producto.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofkau.implemetacionretoddd.domain.producto.values.EmpaqueId;
import co.com.sofkau.implemetacionretoddd.domain.producto.values.TipoEmpaque;

public final class CambiarTipoEmpaqueProducto implements Command {

    private EmpaqueId empaqueId;
    private TipoEmpaque tipoEmpaque;

    public CambiarTipoEmpaqueProducto(EmpaqueId empaqueId, TipoEmpaque tipoEmpaque) {
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
