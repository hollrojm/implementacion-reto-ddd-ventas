package co.com.sofkau.implemetacionretoddd.domain.venta.entities;

import co.com.sofka.domain.generic.Entity;
import co.com.sofkau.implemetacionretoddd.domain.venta.values.FacturaId;
import co.com.sofkau.implemetacionretoddd.domain.venta.values.FechaFactura;
import co.com.sofkau.implemetacionretoddd.domain.venta.values.Precio;

import java.util.Objects;

public final class Factura extends Entity<FacturaId> {

    protected FechaFactura fechaFactura;
    protected Precio precio;

    public Factura(FacturaId facturaId, FechaFactura fechaFactura, Precio precio) {
        super(facturaId);
        this.fechaFactura = fechaFactura;
        this.precio = precio;
    }

    public void modificarPrecio(Precio precio){
        this.precio = Objects.requireNonNull(precio);
    }

    public FechaFactura getFechaFactura() {
        return fechaFactura;
    }

    public Precio getPrecio() {
        return precio;
    }
}
