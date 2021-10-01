package co.com.sofkau.implemetacionretoddd.domain.producto.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofkau.implemetacionretoddd.domain.producto.values.Marca;

import co.com.sofkau.implemetacionretoddd.domain.producto.values.ProductoId;

public final class MarcaModificada extends DomainEvent {

    protected ProductoId productoId;
    protected Marca marca;

    public MarcaModificada(ProductoId productoId, Marca marca) {
        super("almacenropa.producto.marcaactualizada");
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
