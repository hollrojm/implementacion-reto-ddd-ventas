package co.com.sofkau.implemetacionretoddd.producto.entities;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofkau.implemetacionretoddd.producto.values.ProductoId;

public final class Producto extends AggregateEvent<ProductoId> {


    public Producto(ProductoId entityId) {
        super(entityId);
    }
}
