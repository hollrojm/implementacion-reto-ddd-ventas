package co.com.sofkau.implemetacionretoddd.domain.producto.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofkau.implemetacionretoddd.domain.producto.entities.BonoDescuento;
import co.com.sofkau.implemetacionretoddd.domain.producto.entities.Empaque;
import co.com.sofkau.implemetacionretoddd.domain.producto.entities.ValorProducto;
import co.com.sofkau.implemetacionretoddd.domain.producto.values.*;

public final class CrearProducto extends Command {

    private ProductoId productoId;
    protected NombreProducto nombreProducto;
    protected BonoDescuentoId bonoDescuentoId;
    protected ValorBonoDescuento valorBonoDescuento;
    protected EmpaqueId empaqueId;
    protected TipoEmpaque tipoEmpaque;
    protected ValorProductoId valorProductoId;
    protected ValorUnitario valorUnitario;
    protected Marca marca;
    protected Color color;
    protected Talla talla;

    public CrearProducto(ProductoId productoId, NombreProducto nombreProducto, BonoDescuentoId bonoDescuentoId, ValorBonoDescuento valorBonoDescuento, EmpaqueId empaqueId, TipoEmpaque tipoEmpaque, ValorProductoId valorProductoId, ValorUnitario valorUnitario, Marca marca, Color color, Talla talla) {

        this.productoId = productoId;
        this.nombreProducto = nombreProducto;
        this.bonoDescuentoId = bonoDescuentoId;
        this.valorBonoDescuento = valorBonoDescuento;
        this.empaqueId = empaqueId;
        this.tipoEmpaque = tipoEmpaque;
        this.valorProductoId = valorProductoId;
        this.valorUnitario = valorUnitario;
        this.marca = marca;
        this.color = color;
        this.talla = talla;
    }

    public ProductoId getProductoId() {
        return productoId;
    }

    public NombreProducto getNombreProducto() {
        return nombreProducto;
    }

    public BonoDescuentoId getBonoDescuentoId() {
        return bonoDescuentoId;
    }

    public ValorBonoDescuento getValorBonoDescuento() {
        return valorBonoDescuento;
    }

    public EmpaqueId getEmpaqueId() {
        return empaqueId;
    }

    public TipoEmpaque getTipoEmpaque() {
        return tipoEmpaque;
    }

    public ValorProductoId getValorProductoId() {
        return valorProductoId;
    }

    public ValorUnitario getValorUnitario() {
        return valorUnitario;
    }

    public Marca getMarca() {
        return marca;
    }

    public Color getColor() {
        return color;
    }

    public Talla getTalla() {
        return talla;
    }
}