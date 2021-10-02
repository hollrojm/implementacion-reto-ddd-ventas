package co.com.sofkau.implemetacionretoddd.domain.producto.entities;

import co.com.sofka.domain.generic.Entity;
import co.com.sofkau.implemetacionretoddd.domain.producto.values.BonoDescuentoId;
import co.com.sofkau.implemetacionretoddd.domain.producto.values.ValorBonoDescuento;

import java.util.Objects;

public final class BonoDescuento extends Entity<BonoDescuentoId> {

    ValorBonoDescuento valorBonoDescuento;

    public BonoDescuento(BonoDescuentoId bonoDescuentoId, ValorBonoDescuento valorBonoDescuento) {
        super(bonoDescuentoId);
        this.valorBonoDescuento = valorBonoDescuento;
    }

    public void actualizarValorBonoDescuento(ValorBonoDescuento valorBonoDescuento){
        this.valorBonoDescuento = Objects.requireNonNull(valorBonoDescuento);
    }

    public ValorBonoDescuento getValorBonoDescuento() {
        return valorBonoDescuento;
    }
}
