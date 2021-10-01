package co.com.sofkau.implemetacionretoddd.domain.producto.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public final class ValorUnitario implements ValueObject<Float> {
    private final Float value;

    public ValorUnitario(Float value) {
        this.value = Objects.requireNonNull(value);
        if(this.value == 0){
            throw new IllegalArgumentException("El valor Unitario no puede ser 0");
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
        ValorUnitario that = (ValorUnitario) o;
        return Objects.equals(value, that.value);
    }
    @Override
    public int hashCode(){
        return Objects.hash(value);
    }
}
