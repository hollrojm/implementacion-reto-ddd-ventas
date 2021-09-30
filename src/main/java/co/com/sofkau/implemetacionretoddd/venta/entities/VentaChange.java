package co.com.sofkau.implemetacionretoddd.venta.entities;

import co.com.sofka.domain.generic.EventChange;
import co.com.sofkau.implemetacionretoddd.producto.entities.Producto;
import co.com.sofkau.implemetacionretoddd.venta.events.ClienteAgregado;
import co.com.sofkau.implemetacionretoddd.venta.events.FacturaAgregada;
import co.com.sofkau.implemetacionretoddd.venta.events.VentaCreada;

import java.util.HashSet;
import java.util.Set;

public final class VentaChange extends EventChange {
    public VentaChange(Venta venta) {
        apply((VentaCreada event)->{
            venta.cantidad = event.getCantidad();
            venta.descuento = event.getDescuento();
            venta.productos =  new HashSet<>();
        });
        apply((ClienteAgregado event)-> {
            venta.cliente = new Cliente(event.getClienteId(), event.getNombre(), event.getCorreoElectronico(), event.getDireccion(),event.getTelefono());
        });
        apply((FacturaAgregada event)->{
            venta.factura = new Factura(event.getFacturaId(),event.getFechaFactura(),event.getPrecio());
        });
    }
}
