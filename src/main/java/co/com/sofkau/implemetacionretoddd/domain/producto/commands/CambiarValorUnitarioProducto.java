package co.com.sofkau.implemetacionretoddd.domain.producto.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofkau.implemetacionretoddd.domain.producto.values.ValorProductoId;
import co.com.sofkau.implemetacionretoddd.domain.producto.values.ValorUnitario;

public final class CambiarValorUnitarioProducto extends Command {
    private ValorProductoId valorProductoId;
    private ValorUnitario valorUnitario;

    public CambiarValorUnitarioProducto(ValorProductoId valorProductoId, ValorUnitario valorUnitario) {
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
