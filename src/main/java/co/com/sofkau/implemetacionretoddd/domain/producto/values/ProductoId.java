package co.com.sofkau.implemetacionretoddd.domain.producto.values;

import co.com.sofka.domain.generic.Identity;

public final class ProductoId extends Identity {
    public ProductoId() {
    }

    public  ProductoId(String id){
        super(id);
    }
    public static ProductoId of(String id){
        return new ProductoId(id);
    }
}
