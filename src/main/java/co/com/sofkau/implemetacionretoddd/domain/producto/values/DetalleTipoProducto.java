package co.com.sofkau.implemetacionretoddd.domain.producto.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public final class DetalleTipoProducto implements ValueObject<String> {
    private final String value;

    public DetalleTipoProducto(String value) {
        this.value = Objects.requireNonNull(value);
        if(this.value.isBlank()){
            throw new IllegalArgumentException("El detalle del producto no debe estar vació");
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
        DetalleTipoProducto that = (DetalleTipoProducto) o;
        return Objects.equals(value, that.value);
    }
    @Override
    public int hashCode(){
        return Objects.hash(value);
    }
}
