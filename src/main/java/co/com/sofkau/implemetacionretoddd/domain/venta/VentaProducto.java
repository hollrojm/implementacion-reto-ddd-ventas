package co.com.sofkau.implemetacionretoddd.domain.venta;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofkau.implemetacionretoddd.domain.producto.Producto;
import co.com.sofkau.implemetacionretoddd.domain.producto.entities.BonoDescuento;
import co.com.sofkau.implemetacionretoddd.domain.producto.entities.Empaque;
import co.com.sofkau.implemetacionretoddd.domain.producto.entities.ValorProducto;
import co.com.sofkau.implemetacionretoddd.domain.producto.values.*;
import co.com.sofkau.implemetacionretoddd.domain.venta.entities.Cliente;
import co.com.sofkau.implemetacionretoddd.domain.venta.entities.Factura;
import co.com.sofkau.implemetacionretoddd.domain.venta.entities.Sucursal;
import co.com.sofkau.implemetacionretoddd.domain.venta.entities.genericvalues.Direccion;
import co.com.sofkau.implemetacionretoddd.domain.venta.entities.genericvalues.Nombre;
import co.com.sofkau.implemetacionretoddd.domain.venta.events.*;
import co.com.sofkau.implemetacionretoddd.domain.venta.values.*;

import java.util.List;
import java.util.Objects;
import java.util.Set;

public class VentaProducto extends AggregateEvent<VentaId> {

    protected Descuento descuento;
    protected Cantidad cantidad;
    protected Set<Producto> productos;
    protected Factura factura;
    protected Sucursal sucursal;
    protected Cliente cliente;


    public VentaProducto(VentaId ventaId, Descuento descuento, Cantidad cantidad) {
        super(ventaId);
        appendChange(new VentaCreada(ventaId,descuento,cantidad)).apply();
    }

    private VentaProducto(VentaId ventaId){
        super(ventaId);
        subscribe(new VentaChange(this));
    }
    public static VentaProducto from(VentaId ventaId, List<DomainEvent> events){
        var ventapro = new VentaProducto(ventaId);
        events.forEach(ventapro::applyEvent);
        return ventapro;
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
    public void asociarProducto(ProductoId productoId, NombreProducto nombreProducto, BonoDescuento bonoDescuento, Empaque empaque, ValorProducto valorProducto, Marca marca, Color color, Talla talla){
        Objects.requireNonNull(productoId);
        Objects.requireNonNull(nombreProducto);
        Objects.requireNonNull(bonoDescuento);
        Objects.requireNonNull(empaque);
        Objects.requireNonNull(valorProducto);
        Objects.requireNonNull(marca);
        Objects.requireNonNull(color);
        Objects.requireNonNull(talla);
        appendChange(new ProductoAsociado(productoId,nombreProducto,  bonoDescuento, empaque,  valorProducto,  marca,  color,  talla)).apply();
    }

    public void cambiarPrecioFactura(FacturaId facturaId, Precio precio){
        appendChange(new PrecioFacturaCambiada(facturaId,precio));
    }

    public void modificarCantidad(FacturaId facturaId, Cantidad cantidad){
        appendChange(new CantidadModificada(facturaId,cantidad));
    }

    public void modificarDescuento(FacturaId facturaId, Descuento descuento){
        appendChange(new DescuentoModificado(facturaId,descuento));
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
