package co.com.sofkau.implemetacionretoddd.domain.venta.usecases;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.business.support.TriggeredEvent;
import co.com.sofkau.implemetacionretoddd.domain.venta.events.EnviarMensaje;


public final class EnviarMessajeUseCase extends UseCase<TriggeredEvent<EnviarMensaje>, ResponseEvents> {


    @Override
    public void executeUseCase(TriggeredEvent<EnviarMensaje> enviarMensajeTriggeredEvent) {
        var event = enviarMensajeTriggeredEvent.getDomainEvent();
        //var service = getService(EnvioMensajeService.class).orElseThrow();

    }
}
