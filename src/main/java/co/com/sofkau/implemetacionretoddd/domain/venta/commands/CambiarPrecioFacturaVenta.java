package co.com.sofkau.implemetacionretoddd.domain.venta.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofkau.implemetacionretoddd.domain.venta.values.FacturaId;
import co.com.sofkau.implemetacionretoddd.domain.venta.values.Precio;

public final class CambiarPrecioFacturaVenta implements Command {

    private final FacturaId facturaId;
    private  final Precio precio;

    public CambiarPrecioFacturaVenta(FacturaId facturaId, Precio precio) {
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
