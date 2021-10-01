package co.com.sofkau.implemetacionretoddd.domain.venta.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofkau.implemetacionretoddd.domain.venta.entities.genericvalues.Direccion;
import co.com.sofkau.implemetacionretoddd.domain.venta.entities.genericvalues.Nombre;
import co.com.sofkau.implemetacionretoddd.domain.venta.values.SucursalId;

public final class AgregarSucursalVenta implements Command {
    protected SucursalId sucursalId;
    protected Nombre nombre;
    protected Direccion direccion;

    public AgregarSucursalVenta(SucursalId sucursalId, Nombre nombre, Direccion direccion) {
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
