package co.com.sofkau.implemetacionretoddd;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofkau.implemetacionretoddd.domain.producto.entities.BonoDescuento;
import co.com.sofkau.implemetacionretoddd.domain.producto.entities.Empaque;
import co.com.sofkau.implemetacionretoddd.domain.producto.entities.ValorProducto;
import co.com.sofkau.implemetacionretoddd.domain.producto.events.*;
import co.com.sofkau.implemetacionretoddd.domain.producto.values.*;

import java.util.List;
import java.util.Objects;

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



    private Producto(ProductoId productoId){
        super(productoId);
        subscribe(new ProductoChange(this));
    }
    public static Producto from(ProductoId productoId, List<DomainEvent> events){
        var producto = new Producto(productoId);
        events.forEach(producto::applyEvent);
        return producto;
    }

    public void agregarProducto(ProductoId productoId, NombreProducto nombreProducto, BonoDescuento bonoDescuento, Empaque empaque, ValorProducto valorProducto, Marca marca, Color color, Talla talla){
        Objects.requireNonNull(productoId);
        Objects.requireNonNull(nombreProducto);
        Objects.requireNonNull(bonoDescuento);
        Objects.requireNonNull(empaque);
        Objects.requireNonNull(valorProducto);
        Objects.requireNonNull(marca);
        Objects.requireNonNull(color);
        Objects.requireNonNull(talla);
        appendChange(new ProductoAgregado(productoId, nombreProducto,  bonoDescuento, empaque,  valorProducto,  marca,  color,  talla)).apply();
    }

    public void modificarNombreProducto(ProductoId productoId, NombreProducto nombreProducto){
        Objects.requireNonNull(productoId);
        Objects.requireNonNull(nombreProducto);
        appendChange(new NombreProductoModificado(productoId,nombreProducto)).apply();
    }
    public void modificarMarca(ProductoId productoId, Marca marca){
        Objects.requireNonNull(productoId);
        Objects.requireNonNull(marca);
        appendChange(new MarcaModificada(productoId,marca)).apply();
    }
    public void modificarColor(ProductoId productoId, Color color){
        Objects.requireNonNull(productoId);
        Objects.requireNonNull(color);
        appendChange(new ColorModificado(productoId,color)).apply();
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





