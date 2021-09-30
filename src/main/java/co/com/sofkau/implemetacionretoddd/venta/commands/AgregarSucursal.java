package co.com.sofkau.implemetacionretoddd.venta.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofkau.implemetacionretoddd.genericvalues.Direccion;
import co.com.sofkau.implemetacionretoddd.genericvalues.Nombre;
import co.com.sofkau.implemetacionretoddd.venta.values.SucursalId;

public final class AgregarSucursal implements Command {
    protected SucursalId sucursalId;
    protected Nombre nombre;
    protected Direccion direccion;

    public AgregarSucursal(SucursalId sucursalId, Nombre nombre, Direccion direccion) {
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
