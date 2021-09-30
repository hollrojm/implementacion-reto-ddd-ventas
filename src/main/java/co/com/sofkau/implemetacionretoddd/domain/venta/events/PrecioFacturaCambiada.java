package co.com.sofkau.implemetacionretoddd.domain.venta.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofkau.implemetacionretoddd.domain.venta.values.FacturaId;
import co.com.sofkau.implemetacionretoddd.domain.venta.values.Precio;

public final class PrecioFacturaCambiada extends DomainEvent {

    private final FacturaId facturaId;
    private  final Precio precio;

    public PrecioFacturaCambiada(FacturaId facturaId, Precio precio) {
        super("almacenropa.venta.preciofacturacambiada");
        this.facturaId = facturaId;
        this.precio = precio;
    }

    public FacturaId getFacturaId() {
        return facturaId;
    }

    public Precio getPrecio() {
        return precio;
    }
}
