package co.com.sofkau.implemetacionretoddd.domain.venta.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public final class CorreoElectronico implements ValueObject<String> {

    private final String value;

    public CorreoElectronico(String value) {
        this.value = Objects.requireNonNull(value);
        if(this.value.isBlank() ){
            throw new IllegalArgumentException("El descuento de la factura no puede ser vació");
        }
        if (!this.value.matches("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)(\\.[A-Za-z]{2,})$")) {
            throw new IllegalArgumentException("Email no valido");
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
        CorreoElectronico that = (CorreoElectronico) o;
        return Objects.equals(value, that.value);
    }
    @Override
    public int hashCode(){
        return Objects.hash(value);
    }
}
