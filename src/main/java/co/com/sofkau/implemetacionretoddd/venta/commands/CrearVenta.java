package co.com.sofkau.implemetacionretoddd.venta.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofkau.implemetacionretoddd.producto.entities.Producto;
import co.com.sofkau.implemetacionretoddd.venta.entities.Factura;
import co.com.sofkau.implemetacionretoddd.venta.entities.Sucursal;
import co.com.sofkau.implemetacionretoddd.venta.values.Cantidad;
import co.com.sofkau.implemetacionretoddd.venta.values.Descuento;
import co.com.sofkau.implemetacionretoddd.venta.values.VentaId;

import java.util.Set;

public final class CrearVenta implements Command {

    protected Descuento descuento;
    protected Cantidad cantidad;
    protected Set<Producto> productos;
    protected Factura factura;
    protected Sucursal sucursal;

    public CrearVenta(Descuento descuento, Cantidad cantidad, Set<Producto> productos, Factura factura, Sucursal sucursal) {
        this.descuento = descuento;
        this.cantidad = cantidad;
        this.productos = productos;
        this.factura = factura;
        this.sucursal = sucursal;
    }

    public Descuento getDescuento() {
        return descuento;
    }

    public Cantidad getCantidad() {
        return cantidad;
    }

    public Set<Producto> getProductos() {
        return productos;
    }

    public Factura getFactura() {
        return factura;
    }

    public Sucursal getSucursal() {
        return sucursal;
    }
}
