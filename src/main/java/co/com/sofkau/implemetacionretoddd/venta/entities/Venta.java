package co.com.sofkau.implemetacionretoddd.venta.entities;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofkau.implemetacionretoddd.genericvalues.Direccion;
import co.com.sofkau.implemetacionretoddd.genericvalues.Nombre;
import co.com.sofkau.implemetacionretoddd.producto.entities.Producto;
import co.com.sofkau.implemetacionretoddd.venta.events.ClienteAgregado;
import co.com.sofkau.implemetacionretoddd.venta.events.FacturaAgregada;
import co.com.sofkau.implemetacionretoddd.venta.events.SucursalAgregada;
import co.com.sofkau.implemetacionretoddd.venta.events.VentaCreada;
import co.com.sofkau.implemetacionretoddd.venta.values.*;

import java.util.Objects;
import java.util.Set;

public final class Venta extends AggregateEvent<VentaId> {

    protected Descuento descuento;
    protected Cantidad cantidad;
    protected Set<Producto> productos;
    protected Factura factura;
    protected Sucursal sucursal;
    protected Cliente cliente;


    public Venta(VentaId ventaId, Descuento descuento, Cantidad cantidad) {
        super(ventaId);
        this.descuento = descuento;
        this.cantidad = cantidad;
        appendChange(new VentaCreada(descuento,cantidad)).apply();
    }

    private Venta(VentaId ventaId){
        super(ventaId);
        subscribe(new VentaChange(this));
    }

    public void agregarCliente(ClienteId clienteId, Nombre nombre, CorreoElectronico correoElectronico, Direccion direccion, Telefono telefono){
        Objects.requireNonNull(clienteId);
        Objects.requireNonNull(nombre);
        Objects.requireNonNull(correoElectronico);
        Objects.requireNonNull(direccion);
        Objects.requireNonNull(telefono);
        appendChange( new ClienteAgregado(clienteId, nombre, correoElectronico, direccion, telefono));
    }

    public void agregarFactura(FacturaId facturaId, FechaFactura fechaFactura, Precio precio){
        Objects.requireNonNull(facturaId);
        Objects.requireNonNull(fechaFactura);
        Objects.requireNonNull(precio);
        appendChange(new FacturaAgregada(facturaId,fechaFactura,precio));
    }

    public void agregarSucursal(SucursalId sucursalId, Nombre nombre, Direccion direccion){
        Objects.requireNonNull(sucursalId);
        Objects.requireNonNull(nombre);
        Objects.requireNonNull(direccion);
        appendChange(new SucursalAgregada(sucursalId, nombre, direccion));

    }

    //getters
    public Descuento descuento() {
        return descuento;
    }

    public Cantidad cantidad() {
        return cantidad;
    }

    public Set<Producto> productos() {
        return productos;
    }

    public Factura factura() {
        return factura;
    }

    public Sucursal sucursal() {
        return sucursal;
    }
    public Cliente cliente() {
        return cliente;
    }
}
