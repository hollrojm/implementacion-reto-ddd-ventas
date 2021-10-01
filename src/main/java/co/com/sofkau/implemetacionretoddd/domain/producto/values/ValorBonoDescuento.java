package co.com.sofkau.implemetacionretoddd.domain.producto.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public final class ValorBonoDescuento implements ValueObject<Float> {

    private final Float value;

    public ValorBonoDescuento(Float value) {
        this.value = Objects.requireNonNull(value);
        if(this.value == null){
            throw new IllegalArgumentException("El valor del Bono no puede vació");
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
        ValorBonoDescuento that = (ValorBonoDescuento) o;
        return Objects.equals(value, that.value);
    }
    @Override
    public int hashCode(){
        return Objects.hash(value);
    }
}
