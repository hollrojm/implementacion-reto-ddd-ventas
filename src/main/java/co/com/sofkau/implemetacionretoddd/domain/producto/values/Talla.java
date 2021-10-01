package co.com.sofkau.implemetacionretoddd.domain.producto.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public final class Talla implements ValueObject<String> {
    private final String value;

    public Talla(String value) {
        this.value = Objects.requireNonNull(value);
        if(this.value.isBlank()){
            throw new IllegalArgumentException("El tipo de empaque no puede estar vació");
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
        Talla that = (Talla) o;
        return Objects.equals(value, that.value);
    }
    @Override
    public int hashCode(){
        return Objects.hash(value);
    }
}
