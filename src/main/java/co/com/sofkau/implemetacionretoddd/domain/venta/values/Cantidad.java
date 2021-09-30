package co.com.sofkau.implemetacionretoddd.domain.venta.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public final class Cantidad implements ValueObject<Integer> {

    private final Integer value;

    public Cantidad(Integer value) {
        this.value = Objects.requireNonNull(value);
        if(this.value == null || this.value == 0 ){
            throw new IllegalArgumentException("La cantidad no puede estar en cero o vacía");
        }
    }

    @Override
    public Integer value() {
        return value;
    }

    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return  false;
        Cantidad that = (Cantidad) o;
        return Objects.equals(value, that.value);
    }
    @Override
    public int hashCode(){
        return Objects.hash(value);
    }
}
