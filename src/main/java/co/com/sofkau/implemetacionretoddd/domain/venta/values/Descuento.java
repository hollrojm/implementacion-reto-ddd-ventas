package co.com.sofkau.implemetacionretoddd.domain.venta.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public final class Descuento implements ValueObject<Float> {
    private final Float value;

    public Descuento(Float value) {
        this.value = Objects.requireNonNull(value);
        if(this.value == null ){
            throw new IllegalArgumentException("El descuento de la factura no puede ser vació");
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
        Descuento that = (Descuento) o;
        return Objects.equals(value, that.value);
    }
    @Override
    public int hashCode(){
        return Objects.hash(value);
    }
}
