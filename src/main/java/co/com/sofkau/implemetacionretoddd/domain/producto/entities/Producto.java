package co.com.sofkau.implemetacionretoddd.domain.producto.entities;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofkau.implemetacionretoddd.domain.producto.values.*;

public final class Producto extends AggregateEvent<ProductoId> {

    protected NombreProducto nombreProducto;
    protected BonoDescuento bonoDescuento;
    protected Empaque empaque;
    protected ValorProducto valorProducto;
    protected Marca marca;
    protected Color color;
    protected Talla talla;

    public Producto(ProductoId productoId, NombreProducto nombreProducto, BonoDescuento bonoDescuento, Empaque empaque, ValorProducto valorProducto, Marca marca, Color color, Talla talla) {
        super(productoId);
        this.nombreProducto = nombreProducto;
        this.bonoDescuento = bonoDescuento;
        this.empaque = empaque;
        this.valorProducto = valorProducto;
        this.marca = marca;
        this.color = color;
        this.talla = talla;
    }





    public NombreProducto nombreProducto() {
        return nombreProducto;
    }

    public BonoDescuento bonoDescuento() {
        return bonoDescuento;
    }

    public Empaque empaque() {
        return empaque;
    }

    public ValorProducto valorProducto() {
        return valorProducto;
    }

    public Marca marca() {
        return marca;
    }

    public Color color() {
        return color;
    }

    public Talla talla() {
        return talla;
    }
}





