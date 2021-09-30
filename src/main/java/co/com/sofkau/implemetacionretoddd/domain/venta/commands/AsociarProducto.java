package co.com.sofkau.implemetacionretoddd.domain.venta.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofkau.implemetacionretoddd.domain.producto.values.ProductoId;

public final class AsociarProducto implements Command {
    protected ProductoId productoId;

    public AsociarProducto(ProductoId productoId) {
        this.productoId = productoId;
    }

    public ProductoId getProductoId() {
        return productoId;
    }
}
