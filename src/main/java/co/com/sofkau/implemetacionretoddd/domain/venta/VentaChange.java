package co.com.sofkau.implemetacionretoddd.domain.venta;

import co.com.sofka.domain.generic.EventChange;
import co.com.sofkau.implemetacionretoddd.domain.venta.entities.Cliente;
import co.com.sofkau.implemetacionretoddd.domain.venta.entities.Factura;
import co.com.sofkau.implemetacionretoddd.domain.venta.entities.Sucursal;
import co.com.sofkau.implemetacionretoddd.domain.venta.events.*;

import java.util.HashSet;


public  class VentaChange extends EventChange {

    public VentaChange(VentaProducto ventaProducto) {

        apply((VentaCreada event)->{
            ventaProducto.cantidad = event.getCantidad();
            ventaProducto.descuento = event.getDescuento();
            ventaProducto.productos =  new HashSet<>();
        });
        apply((ClienteAgregado event)-> ventaProducto.cliente = new Cliente(event.getClienteId(), event.getNombre(), event.getCorreoElectronico(), event.getDireccion(),event.getTelefono()));

        apply((FacturaAgregada event)-> ventaProducto.factura = new Factura(event.getFacturaId(),event.getFechaFactura(),event.getPrecio()));

        apply((SucursalAgregada event)-> ventaProducto.sucursal = new Sucursal(event.getSucursalId(),event.getNombre(),event.getDireccion()));

        //apply((ProductoAsociado event)-> ventaProducto.productos.add(event.getProductoId()).setNombreProducto(event.getNombreProducto()).setBonoDescuento(event.getBonoDescuento()).setEmpaque(event.getEmpaque()).setValorProducto(event.getValorProducto()).setMarca(event.getMarca()).setColor(event.getColor()).setTalla(event.getTalla()).createProducto()));

        apply((PrecioFacturaCambiada event)-> ventaProducto.factura.modificarPrecio(event.getPrecio()));

        apply((CantidadModificada event)-> ventaProducto.cantidad=event.getCantidad());

        apply((DescuentoModificado event)-> ventaProducto.descuento=event.getDescuento());


    }
}
