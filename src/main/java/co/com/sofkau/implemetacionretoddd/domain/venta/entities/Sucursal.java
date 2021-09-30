package co.com.sofkau.implemetacionretoddd.domain.venta.entities;

import co.com.sofka.domain.generic.Entity;
import co.com.sofkau.implemetacionretoddd.domain.venta.entities.genericvalues.Direccion;
import co.com.sofkau.implemetacionretoddd.domain.venta.entities.genericvalues.Nombre;
import co.com.sofkau.implemetacionretoddd.domain.venta.values.SucursalId;

public final class Sucursal extends Entity<SucursalId> {

    protected Nombre nombre;
    protected Direccion direccion;

    public Sucursal(SucursalId sucursalId, Nombre nombre, Direccion direccion) {
        super(sucursalId);
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public Direccion getDireccion() {
        return direccion;
    }
}
