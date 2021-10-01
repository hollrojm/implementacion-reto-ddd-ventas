package co.com.sofkau.implemetacionretoddd.domain.producto.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofkau.implemetacionretoddd.domain.producto.values.NombreProducto;
import co.com.sofkau.implemetacionretoddd.domain.producto.values.ProductoId;

public final class NombreProductoModificado extends DomainEvent {
    protected ProductoId productoId;
    protected NombreProducto nombreProducto;

    public NombreProductoModificado(ProductoId productoId, NombreProducto nombreProducto) {
        super("almacenropa.producto.nombreproductoactualizado");
        this.productoId = this.productoId;
        this.nombreProducto = nombreProducto;
    }

    public ProductoId getProductoId() {
        return productoId;
    }

    public NombreProducto getNombreProducto() {
        return nombreProducto;
    }
}
