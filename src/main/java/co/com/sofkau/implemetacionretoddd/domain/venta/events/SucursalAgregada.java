package co.com.sofkau.implemetacionretoddd.domain.venta.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofkau.implemetacionretoddd.domain.venta.entities.genericvalues.Direccion;
import co.com.sofkau.implemetacionretoddd.domain.venta.entities.genericvalues.Nombre;
import co.com.sofkau.implemetacionretoddd.domain.venta.values.SucursalId;

public final class SucursalAgregada extends DomainEvent {
    protected SucursalId sucursalId;
    protected Nombre nombre;
    protected Direccion direccion;

    public SucursalAgregada(SucursalId sucursalId, Nombre nombre, Direccion direccion) {
        super("almacenropa.venta.sucursalagregada");
        this.sucursalId = sucursalId;
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public SucursalId getSucursalId() {
        return sucursalId;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public Direccion getDireccion() {
        return direccion;
    }
}
