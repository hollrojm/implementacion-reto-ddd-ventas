package co.com.sofkau.implemetacionretoddd.domain.venta.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofkau.implemetacionretoddd.domain.venta.values.Descuento;
import co.com.sofkau.implemetacionretoddd.domain.venta.values.FacturaId;

public final class ModificarDescuentoEnVenta implements Command {

    private final FacturaId facturaId;
    private final Descuento descuento;

    public ModificarDescuentoEnVenta(FacturaId facturaId, Descuento descuento) {
        this.facturaId = facturaId;
        this.descuento = descuento;
    }

    public FacturaId getFacturaId() {
        return facturaId;
    }

    public Descuento getDescuento() {
        return descuento;
    }
}
