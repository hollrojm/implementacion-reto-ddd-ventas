package co.com.sofkau.implemetacionretoddd.domain.producto.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofkau.implemetacionretoddd.domain.producto.values.Marca;
import co.com.sofkau.implemetacionretoddd.domain.producto.values.ProductoId;

public final class CambiarMarcaProducto extends Command {

    protected ProductoId productoId;
    protected Marca marca;

    public CambiarMarcaProducto(ProductoId productoId, Marca marca) {
        this.productoId = productoId;
        this.marca = marca;
    }

    public ProductoId getProductoId() {
        return productoId;
    }

    public Marca getMarca() {
        return marca;
    }
}
