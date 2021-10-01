package co.com.sofkau.implemetacionretoddd;

import co.com.sofka.domain.generic.EventChange;
import co.com.sofkau.implemetacionretoddd.domain.producto.events.*;

public final class ProductoChange extends EventChange {
    public ProductoChange(Producto producto) {

        apply((ProductoAgregado event)->{
            producto.nombreProducto = event.getNombreProducto();
            producto.valorProducto = event.getValorProducto();
            producto.bonoDescuento = event.getBonoDescuento();
            producto.color = event.getColor();
            producto.empaque = event.getEmpaque();
            producto.marca = event.getMarca();
            producto.talla = event.getTalla();
        });

        apply((NombreProductoModificado event)->{
            producto.modificarNombreProducto(event.getProductoId(),event.getNombreProducto());
        });

        apply((TipoEmpaqueModificado event)->{
            producto.empaque.modificarTipoEmpaque(event.getTipoEmpaque());
        });

        apply((MarcaModificada event)->{
            producto.marca =event.getMarca();
        });

        apply((ColorModificado event)->{
            producto.color = event.getColor();
        });

        apply((ValorBonoDescuentoModificado event)->{
            producto.bonoDescuento.modificarValorBonoDescuento(event.getValorBonoDescuento());
        });
        apply((ValorUnitarioModificado event)->{
            producto.valorProducto.modificarValorUnitario(event.getValorUnitario());
        });










    }
}
