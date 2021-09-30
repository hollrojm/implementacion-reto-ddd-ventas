package co.com.sofkau.implemetacionretoddd.domain.venta.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofkau.implemetacionretoddd.domain.venta.values.Cantidad;
import co.com.sofkau.implemetacionretoddd.domain.venta.values.FacturaId;

public final class ModificarCantidad implements Command {

    private final FacturaId facturaId;
    private final Cantidad cantidad;

    public ModificarCantidad(FacturaId facturaId, Cantidad cantidad) {

        this.facturaId = facturaId;
        this.cantidad = cantidad;
    }

    public FacturaId getFacturaId() {
        return facturaId;
    }

    public Cantidad getCantidad() {
        return cantidad;
    }
}
