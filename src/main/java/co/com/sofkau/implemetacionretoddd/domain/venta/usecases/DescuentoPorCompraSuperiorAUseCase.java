package co.com.sofkau.implemetacionretoddd.domain.venta.usecases;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.business.support.TriggeredEvent;
import co.com.sofkau.implemetacionretoddd.domain.venta.VentaProducto;
import co.com.sofkau.implemetacionretoddd.domain.venta.events.DescuentoPorCompraSuperiorA;
import co.com.sofkau.implemetacionretoddd.domain.venta.values.Cantidad;
import co.com.sofkau.implemetacionretoddd.domain.venta.values.VentaId;

public final class DescuentoPorCompraSuperiorAUseCase extends UseCase<TriggeredEvent<DescuentoPorCompraSuperiorA>, ResponseEvents> {
    private static final double PORCENTAJE_DESCUENTO = 0.010;

    @Override
    public void executeUseCase(TriggeredEvent<DescuentoPorCompraSuperiorA> descuentoPorCompraSuperiorATriggeredEvent) {
        var event = descuentoPorCompraSuperiorATriggeredEvent.getDomainEvent();
        var ventaProducto = VentaProducto.from(VentaId.of(event.aggregateRootId()),this.retrieveEvents());

    }
}
