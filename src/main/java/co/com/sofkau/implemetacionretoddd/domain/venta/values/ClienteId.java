package co.com.sofkau.implemetacionretoddd.domain.venta.values;

import co.com.sofka.domain.generic.Identity;

public final class ClienteId extends Identity{
    public ClienteId() {
    }

    public  ClienteId(String id){
        super(id);
    }
    public static ClienteId of(String id){
        return new ClienteId(id);
    }
}
