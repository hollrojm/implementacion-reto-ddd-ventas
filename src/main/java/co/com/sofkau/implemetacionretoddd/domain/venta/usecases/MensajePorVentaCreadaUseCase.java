package co.com.sofkau.implemetacionretoddd.domain.venta.usecases;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.business.support.TriggeredEvent;
import co.com.sofkau.implemetacionretoddd.domain.venta.VentaProducto;
import co.com.sofkau.implemetacionretoddd.domain.venta.events.VentaCreada;
import co.com.sofkau.implemetacionretoddd.domain.venta.values.VentaId;

public final class MensajePorVentaCreadaUseCase extends UseCase<TriggeredEvent<VentaCreada>, ResponseEvents> {
    @Override
    public void executeUseCase(TriggeredEvent<VentaCreada> ventaCreadaTriggeredEvent) {
        var event = ventaCreadaTriggeredEvent.getDomainEvent();
        var ventaProducto = VentaProducto.from(VentaId.of(event.aggregateRootId()),this.retrieveEvents());
        emit().onResponse(new ResponseEvents(ventaProducto.getUncommittedChanges()));
    }
}
