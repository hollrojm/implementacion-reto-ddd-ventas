package co.com.sofkau.implemetacionretoddd.domain.venta.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofkau.implemetacionretoddd.domain.venta.entities.genericvalues.Direccion;
import co.com.sofkau.implemetacionretoddd.domain.venta.entities.genericvalues.Nombre;
import co.com.sofkau.implemetacionretoddd.domain.venta.values.ClienteId;
import co.com.sofkau.implemetacionretoddd.domain.venta.values.CorreoElectronico;
import co.com.sofkau.implemetacionretoddd.domain.venta.values.Telefono;

public final class AgregarCliente implements Command {
    protected ClienteId clienteId;
    protected Nombre nombre;
    protected CorreoElectronico correoElectronico;
    protected Direccion direccion;
    protected Telefono telefono;

    public AgregarCliente(ClienteId clienteId, Nombre nombre, CorreoElectronico correoElectronico, Direccion direccion, Telefono telefono) {
        this.nombre = nombre;
        this.correoElectronico = correoElectronico;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public ClienteId getClienteId() {
        return clienteId;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public CorreoElectronico getCorreoElectronico() {
        return correoElectronico;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public Telefono getTelefono() {
        return telefono;
    }
}
