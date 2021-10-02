package co.com.sofkau.implemetacionretoddd.domain.venta.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofkau.implemetacionretoddd.domain.venta.entities.genericvalues.Direccion;
import co.com.sofkau.implemetacionretoddd.domain.venta.entities.genericvalues.Nombre;
import co.com.sofkau.implemetacionretoddd.domain.venta.values.ClienteId;
import co.com.sofkau.implemetacionretoddd.domain.venta.values.CorreoElectronico;
import co.com.sofkau.implemetacionretoddd.domain.venta.values.Telefono;
import co.com.sofkau.implemetacionretoddd.domain.venta.values.VentaId;

public final class AgregarClienteVenta extends Command {

    private VentaId ventaId;
    private ClienteId clienteId;
    private Nombre nombre;
    private CorreoElectronico correoElectronico;
    private Direccion direccion;
    private Telefono telefono;

    public AgregarClienteVenta(VentaId ventaId, ClienteId clienteId, Nombre nombre, CorreoElectronico correoElectronico, Direccion direccion, Telefono telefono) {
        this.ventaId = ventaId;
        this.clienteId = clienteId;
        this.nombre = nombre;
        this.correoElectronico = correoElectronico;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public VentaId getVentaId() {
        return ventaId;
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
