package co.com.sofkau.implemetacionretoddd.domain.venta.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofkau.implemetacionretoddd.domain.venta.values.FacturaId;
import co.com.sofkau.implemetacionretoddd.domain.venta.values.FechaFactura;
import co.com.sofkau.implemetacionretoddd.domain.venta.values.Precio;

public final class FacturaAgregada extends DomainEvent {

    protected FacturaId facturaId;
    protected FechaFactura fechaFactura;
    protected Precio precio;

    public FacturaAgregada(FacturaId facturaId, FechaFactura fechaFactura, Precio precio) {
        super("almacenropa.venta.facturaagregada");
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
