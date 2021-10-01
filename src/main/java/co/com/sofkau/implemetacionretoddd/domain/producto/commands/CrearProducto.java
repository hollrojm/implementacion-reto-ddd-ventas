package co.com.sofkau.implemetacionretoddd.domain.producto.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofkau.implemetacionretoddd.domain.producto.entities.BonoDescuento;
import co.com.sofkau.implemetacionretoddd.domain.producto.entities.Empaque;
import co.com.sofkau.implemetacionretoddd.domain.producto.entities.ValorProducto;
import co.com.sofkau.implemetacionretoddd.domain.producto.values.*;

public final class CrearProducto implements Command {

    private ProductoId productoId;
    protected NombreProducto nombreProducto;
    protected BonoDescuento bonoDescuento;
    protected Empaque empaque;
    protected ValorProducto valorProducto;
    protected Marca marca;
    protected Color color;
    protected Talla talla;

    public CrearProducto(ProductoId productoId, NombreProducto nombreProducto, BonoDescuento bonoDescuento, Empaque empaque, ValorProducto valorProducto, Marca marca, Color color, Talla talla) {
        this.productoId = productoId;
        this.nombreProducto = nombreProducto;
        this.bonoDescuento = bonoDescuento;
        this.empaque = empaque;
        this.valorProducto = valorProducto;
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

    public BonoDescuento getBonoDescuento() {
        return bonoDescuento;
    }

    public Empaque getEmpaque() {
        return empaque;
    }

    public ValorProducto getValorProducto() {
        return valorProducto;
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
