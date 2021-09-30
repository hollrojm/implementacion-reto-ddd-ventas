package co.com.sofkau.implemetacionretoddd.domain.venta.values;

import co.com.sofka.domain.generic.Identity;

public final class FacturaId extends Identity {

    public FacturaId() {
    }

    public  FacturaId(String id){
        super(id);
    }
    public static FacturaId of(String id){
        return new FacturaId(id);
    }

}
