package co.com.sofkau.implemetacionretoddd.domain.producto.values;

import co.com.sofka.domain.generic.Identity;

public final class EmpaqueId extends Identity {
    public EmpaqueId() {
    }

    public  EmpaqueId(String id){
        super(id);
    }
    public static EmpaqueId of(String id){
        return new EmpaqueId(id);
    }
}
