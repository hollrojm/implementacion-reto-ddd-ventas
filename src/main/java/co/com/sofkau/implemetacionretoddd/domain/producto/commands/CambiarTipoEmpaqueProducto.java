package co.com.sofkau.implemetacionretoddd.domain.producto.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofkau.implemetacionretoddd.domain.producto.values.EmpaqueId;
import co.com.sofkau.implemetacionretoddd.domain.producto.values.ProductoId;
import co.com.sofkau.implemetacionretoddd.domain.producto.values.TipoEmpaque;

public final class CambiarTipoEmpaqueProducto extends Command {

    private ProductoId productoId;
    private EmpaqueId empaqueId;
    private TipoEmpaque tipoEmpaque;

    public CambiarTipoEmpaqueProducto(ProductoId productoId, EmpaqueId empaqueId, TipoEmpaque tipoEmpaque) {
        this.productoId = productoId;
        this.empaqueId = empaqueId;
        this.tipoEmpaque = tipoEmpaque;
    }

    public ProductoId getProductoId() {
        return productoId;
    }

    public EmpaqueId getEmpaqueId() {
        return empaqueId;
    }

    public TipoEmpaque getTipoEmpaque() {
        return tipoEmpaque;
    }
}
