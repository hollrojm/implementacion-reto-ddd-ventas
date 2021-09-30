package co.com.sofkau.implemetacionretoddd.venta.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofkau.implemetacionretoddd.venta.values.FacturaId;
import co.com.sofkau.implemetacionretoddd.venta.values.Precio;

public final class CambiarPrecioFactura implements Command {

    private final FacturaId facturaId;
    private  final Precio precio;

    public CambiarPrecioFactura(FacturaId facturaId, Precio precio) {
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
