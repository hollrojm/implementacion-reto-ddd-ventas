package co.com.sofkau.implemetacionretoddd.domain.producto.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofkau.implemetacionretoddd.domain.producto.values.ValorProductoId;
import co.com.sofkau.implemetacionretoddd.domain.producto.values.ValorUnitario;

public final class ValorUnitarioModificado extends DomainEvent {
    private ValorProductoId valorProductoId;
    private ValorUnitario valorUnitario;

    public ValorUnitarioModificado(ValorProductoId valorProductoId, ValorUnitario valorUnitario) {
        super("almacenropa.producto.valorbonodedescuentoactualizado");
        this.valorProductoId = valorProductoId;
        this.valorUnitario = valorUnitario;
    }

    public ValorProductoId getValorProductoId() {
        return valorProductoId;
    }

    public ValorUnitario getValorUnitario() {
        return valorUnitario;
    }
}
