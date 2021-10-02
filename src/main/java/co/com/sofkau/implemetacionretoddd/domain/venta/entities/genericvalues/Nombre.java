package co.com.sofkau.implemetacionretoddd.domain.venta.entities.genericvalues;

import co.com.sofka.domain.generic.ValueObject;
import co.com.sofkau.implemetacionretoddd.domain.venta.values.Telefono;

import java.util.Objects;

public final class Nombre implements ValueObject<String> {
    private final String value;

    public Nombre(String value) {
        this.value = Objects.requireNonNull(value);
        if(this.value.isBlank()){
            throw new IllegalArgumentException("El Nombre del cliente  no puede estar vació");
        }
    }

    @Override
    public String value() {
        return value;
    }

    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return  false;
        Nombre that = (Nombre) o;
        return Objects.equals(value, that.value);
    }
    @Override
    public int hashCode(){
        return Objects.hash(value);
    }
}
