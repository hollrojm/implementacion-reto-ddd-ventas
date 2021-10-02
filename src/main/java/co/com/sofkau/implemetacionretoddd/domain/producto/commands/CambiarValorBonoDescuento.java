package co.com.sofkau.implemetacionretoddd.domain.producto.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofkau.implemetacionretoddd.domain.producto.values.BonoDescuentoId;
import co.com.sofkau.implemetacionretoddd.domain.producto.values.ProductoId;
import co.com.sofkau.implemetacionretoddd.domain.producto.values.ValorBonoDescuento;

public final class CambiarValorBonoDescuento extends Command {

    private ProductoId productoId;
    private BonoDescuentoId bonoDescuentoId;
    private ValorBonoDescuento valorBonoDescuento;

    public CambiarValorBonoDescuento(ProductoId productoId, BonoDescuentoId bonoDescuentoId, ValorBonoDescuento valorBonoDescuento) {
        this.productoId = productoId;
        this.bonoDescuentoId = bonoDescuentoId;
        this.valorBonoDescuento = valorBonoDescuento;
    }

    public ProductoId getProductoId() {
        return productoId;
    }

    public BonoDescuentoId getBonoDescuentoId() {
        return bonoDescuentoId;
    }

    public ValorBonoDescuento getValorBonoDescuento() {
        return valorBonoDescuento;
    }
}
