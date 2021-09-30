package co.com.sofkau.implemetacionretoddd.venta.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofkau.implemetacionretoddd.genericvalues.Direccion;
import co.com.sofkau.implemetacionretoddd.genericvalues.Nombre;
import co.com.sofkau.implemetacionretoddd.venta.values.ClienteId;
import co.com.sofkau.implemetacionretoddd.venta.values.CorreoElectronico;
import co.com.sofkau.implemetacionretoddd.venta.values.Telefono;

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
