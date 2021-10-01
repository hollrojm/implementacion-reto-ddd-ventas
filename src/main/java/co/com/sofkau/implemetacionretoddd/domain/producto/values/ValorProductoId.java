package co.com.sofkau.implemetacionretoddd.domain.producto.values;

import co.com.sofka.domain.generic.Identity;


public final class ValorProductoId extends Identity {
    public ValorProductoId() {
    }

    public  ValorProductoId(String id){
        super(id);
    }
    public static ValorProductoId of(String id){
        return new ValorProductoId(id);
    }
}
