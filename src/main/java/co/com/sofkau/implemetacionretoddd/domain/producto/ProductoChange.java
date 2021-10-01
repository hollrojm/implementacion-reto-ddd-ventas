package co.com.sofkau.implemetacionretoddd.domain.producto;

import co.com.sofka.domain.generic.EventChange;
import co.com.sofkau.implemetacionretoddd.domain.producto.Producto;
import co.com.sofkau.implemetacionretoddd.domain.producto.entities.BonoDescuento;
import co.com.sofkau.implemetacionretoddd.domain.producto.entities.Empaque;
import co.com.sofkau.implemetacionretoddd.domain.producto.entities.ValorProducto;
import co.com.sofkau.implemetacionretoddd.domain.producto.events.*;

public final class ProductoChange extends EventChange {
    public ProductoChange(Producto producto) {

        apply((ProductoAgregado event)->{
            producto.nombreProducto = event.getNombreProducto();
            producto.valorProducto = new ValorProducto(event.getValorProductoId(),event.getValorUnitario());
            producto.bonoDescuento = new BonoDescuento(event.getBonoDescuentoId(),event.getValorBonoDescuento());
            producto.color = event.getColor();
            producto.empaque = new Empaque(event.getEmpaqueId(),event.getTipoEmpaque());
            producto.marca = event.getMarca();
            producto.talla = event.getTalla();
        });

        apply((NombreProductoModificado event)-> producto.modificarNombreProducto(event.getProductoId(),event.getNombreProducto()));

        apply((TipoEmpaqueModificado event)-> producto.empaque.modificarTipoEmpaque(event.getTipoEmpaque()));

        apply((MarcaModificada event)-> producto.marca =event.getMarca());

        apply((ColorModificado event)-> producto.color = event.getColor());

        apply((ValorBonoDescuentoModificado event)-> producto.bonoDescuento.modificarValorBonoDescuento(event.getValorBonoDescuento()));

        apply((ValorUnitarioModificado event)-> producto.valorProducto.modificarValorUnitario(event.getValorUnitario()));










    }
}
