package co.com.sofkau.implemetacionretoddd.domain.producto.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofkau.implemetacionretoddd.domain.producto.values.Color;
import co.com.sofkau.implemetacionretoddd.domain.producto.values.ProductoId;

public final class ColorModificado extends DomainEvent {

    protected ProductoId productoId;
    protected Color color;

    public ColorModificado(ProductoId productoId, Color color) {
        super("almacenropa.producto.coloractualizado");
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
