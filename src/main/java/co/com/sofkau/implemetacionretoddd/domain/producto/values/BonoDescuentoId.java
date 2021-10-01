package co.com.sofkau.implemetacionretoddd.domain.producto.values;

import co.com.sofka.domain.generic.Identity;

public final class BonoDescuentoId extends Identity {

    public BonoDescuentoId() {
    }

    public  BonoDescuentoId(String id){
        super(id);
    }
    public static BonoDescuentoId of(String id){
        return new BonoDescuentoId(id);
    }
}
