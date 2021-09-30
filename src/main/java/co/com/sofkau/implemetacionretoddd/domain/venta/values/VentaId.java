package co.com.sofkau.implemetacionretoddd.domain.venta.values;

import co.com.sofka.domain.generic.Identity;

public final class VentaId extends Identity {

    public VentaId() {
    }

    public  VentaId(String id){
        super(id);
    }
    public static VentaId of(String id){
        return new VentaId(id);
    }
}
