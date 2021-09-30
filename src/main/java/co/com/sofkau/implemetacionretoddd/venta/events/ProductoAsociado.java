package co.com.sofkau.implemetacionretoddd.venta.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofkau.implemetacionretoddd.producto.values.ProductoId;
import co.com.sofkau.implemetacionretoddd.venta.values.ClienteId;

public final class ProductoAsociado extends DomainEvent {
    protected ProductoId productoId;

    public ProductoAsociado(ProductoId productoId) {
        super("almacenropa.venta.productoasociado");
        this.productoId = productoId;
    }

    public ProductoId getProductoId() {
        return productoId;
    }
}
