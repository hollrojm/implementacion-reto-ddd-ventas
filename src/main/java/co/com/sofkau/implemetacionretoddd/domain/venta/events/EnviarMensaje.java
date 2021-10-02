package co.com.sofkau.implemetacionretoddd.domain.venta.events;

import co.com.sofka.domain.generic.DomainEvent;

public final class EnviarMensaje extends DomainEvent {
    private final String mensaje;

    public EnviarMensaje(String mensaje) {
        super("almacenventaropa.ventaproducto.enviarmensaje");
        this.mensaje = mensaje;
    }

    public String getMensaje() {
        return mensaje;
    }
}
