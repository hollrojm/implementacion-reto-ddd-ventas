package co.com.sofkau.implemetacionretoddd.domain.venta.entities.genericvalues;

import co.com.sofka.domain.generic.ValueObject;
import co.com.sofkau.implemetacionretoddd.domain.venta.values.Telefono;

import java.util.Objects;

public final class Direccion implements ValueObject<String> {
    private final String value;

    public Direccion(String value) {
        this.value = Objects.requireNonNull(value);
        if(this.value.isBlank()){
            throw new IllegalArgumentException("La direccion del cliente no puede estar vaciá");
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
        Direccion that = (Direccion) o;
        return Objects.equals(value, that.value);
    }
    @Override
    public int hashCode(){
        return Objects.hash(value);
    }
}
