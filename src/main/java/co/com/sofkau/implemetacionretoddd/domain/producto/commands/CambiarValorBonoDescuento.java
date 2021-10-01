package co.com.sofkau.implemetacionretoddd.domain.producto.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofkau.implemetacionretoddd.domain.producto.values.BonoDescuentoId;
import co.com.sofkau.implemetacionretoddd.domain.producto.values.ValorBonoDescuento;

public final class CambiarValorBonoDescuento extends Command {

    private BonoDescuentoId bonoDescuentoId;
    private ValorBonoDescuento valorBonoDescuento;

    public CambiarValorBonoDescuento(BonoDescuentoId bonoDescuentoId, ValorBonoDescuento valorBonoDescuento) {
        this.bonoDescuentoId = bonoDescuentoId;
        this.valorBonoDescuento = valorBonoDescuento;
    }

    public BonoDescuentoId getBonoDescuentoId() {
        return bonoDescuentoId;
    }

    public ValorBonoDescuento getValorBonoDescuento() {
        return valorBonoDescuento;
    }
}
