package co.com.sofkau.implemetacionretoddd.domain.venta.values;

import co.com.sofka.domain.generic.Identity;

public final class SucursalId extends Identity {
    public SucursalId() {
    }

    public  SucursalId(String id){
        super(id);
    }
    public static SucursalId of(String id){
        return new SucursalId(id);
    }
}
