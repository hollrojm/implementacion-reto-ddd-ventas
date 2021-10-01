package co.com.sofkau.implemetacionretoddd.domain.producto.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofkau.implemetacionretoddd.domain.producto.entities.BonoDescuento;
import co.com.sofkau.implemetacionretoddd.domain.producto.values.BonoDescuentoId;
import co.com.sofkau.implemetacionretoddd.domain.producto.values.ProductoId;
import co.com.sofkau.implemetacionretoddd.domain.producto.values.ValorBonoDescuento;

public final class ValorBonoDescuentoModificado extends DomainEvent {

    private BonoDescuentoId bonoDescuentoId;
    private ValorBonoDescuento valorBonoDescuento;

    public ValorBonoDescuentoModificado(BonoDescuentoId bonoDescuentoId, ValorBonoDescuento valorBonoDescuento) {
        super("almacenropa.producto.valorbonodedescuentoactualizado");
        this.bonoDescuentoId = bonoDescuentoId;
        this.valorBonoDescuento = valorBonoDescuento;
    }

    public BonoDescuentoId getBonoDescuentoId() {
        return bonoDescuentoId;
    }

    public ValorBonoDescuento getValorBonoDescuento() {
        return valorBonoDescuento;
    }
}
