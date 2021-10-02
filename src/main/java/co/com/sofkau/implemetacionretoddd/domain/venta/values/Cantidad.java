package co.com.sofkau.implemetacionretoddd.domain.venta.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public final class Cantidad implements ValueObject<String> {

    private final String value;

    public Cantidad(String value) {
        this.value = Objects.requireNonNull(value);
        if(this.value.isBlank() ){
            throw new IllegalArgumentException("La cantidad no puede estar en cero o vacía");
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
        Cantidad that = (Cantidad) o;
        return Objects.equals(value, that.value);
    }
    @Override
    public int hashCode(){
        return Objects.hash(value);
    }
}
