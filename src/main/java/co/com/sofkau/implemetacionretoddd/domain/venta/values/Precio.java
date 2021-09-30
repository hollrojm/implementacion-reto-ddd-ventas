package co.com.sofkau.implemetacionretoddd.domain.venta.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public final class Precio implements ValueObject<Float> {
    private final Float value;

    public Precio(Float value) {
        this.value = Objects.requireNonNull(value);
        if(this.value == null || this.value == 0){
            throw new IllegalArgumentException("El precio de la factura no puede ser vacio o cero");
        }
    }

    @Override
    public Float value() {
        return value;
    }

    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return  false;
        Precio that = (Precio) o;
        return Objects.equals(value, that.value);
    }
    @Override
    public int hashCode(){
        return Objects.hash(value);
    }
}
