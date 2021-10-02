package co.com.sofkau.implemetacionretoddd.domain.producto.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofkau.implemetacionretoddd.domain.producto.values.NombreProducto;
import co.com.sofkau.implemetacionretoddd.domain.producto.values.ProductoId;

public final class CambiarNombreProducto extends Command {

    protected ProductoId productoId;
    protected NombreProducto nombreProducto;

    public CambiarNombreProducto(ProductoId productoId, NombreProducto nombreProducto) {
        this.productoId = productoId;
        this.nombreProducto = nombreProducto;
    }

    public ProductoId getProductoId() {
        return productoId;
    }

    public NombreProducto getNombreProducto() {
        return nombreProducto;
    }
}
