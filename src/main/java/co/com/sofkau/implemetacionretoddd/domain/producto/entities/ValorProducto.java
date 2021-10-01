package co.com.sofkau.implemetacionretoddd.domain.producto.entities;

import co.com.sofka.domain.generic.Entity;
import co.com.sofkau.implemetacionretoddd.domain.producto.values.ValorProductoId;
import co.com.sofkau.implemetacionretoddd.domain.producto.values.ValorUnitario;

import java.util.Objects;


public final class ValorProducto extends Entity<ValorProductoId> {

    protected ValorUnitario valorUnitario;

    public ValorProducto(ValorProductoId valorProductoId, ValorUnitario valorUnitario) {
        super(valorProductoId);
        this.valorUnitario = valorUnitario;
    }

    public void modificarValorUnitario(ValorUnitario valorUnitario){
        this.valorUnitario = Objects.requireNonNull(valorUnitario);

    }


    public ValorUnitario getValorUnitario() {
        return valorUnitario;
    }
}
