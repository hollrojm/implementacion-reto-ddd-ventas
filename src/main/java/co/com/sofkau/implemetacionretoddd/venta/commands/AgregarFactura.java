package co.com.sofkau.implemetacionretoddd.venta.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofkau.implemetacionretoddd.venta.values.FacturaId;
import co.com.sofkau.implemetacionretoddd.venta.values.FechaFactura;
import co.com.sofkau.implemetacionretoddd.venta.values.Precio;

public final class AgregarFactura implements Command {

    protected FacturaId facturaId;
    protected FechaFactura fechaFactura;
    protected Precio precio;

    public AgregarFactura(FacturaId facturaId, FechaFactura fechaFactura, Precio precio) {
        this.facturaId = facturaId;
        this.fechaFactura = fechaFactura;
        this.precio = precio;
    }

    public FacturaId getFacturaId() {
        return facturaId;
    }

    public FechaFactura getFechaFactura() {
        return fechaFactura;
    }

    public Precio getPrecio() {
        return precio;
    }
}
