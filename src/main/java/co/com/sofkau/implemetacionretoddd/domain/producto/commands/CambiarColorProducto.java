package co.com.sofkau.implemetacionretoddd.domain.producto.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofkau.implemetacionretoddd.domain.producto.values.Color;
import co.com.sofkau.implemetacionretoddd.domain.producto.values.ProductoId;

public class CambiarColorProducto extends Command {

    protected ProductoId productoId;
    protected Color color;

    public CambiarColorProducto(ProductoId productoId, Color color) {
        this.productoId = productoId;
        this.color = color;
    }

    public ProductoId getProductoId() {
        return productoId;
    }

    public Color getColor() {
        return color;
    }
}
