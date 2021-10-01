package co.com.sofkau.implemetacionretoddd.builder;

import co.com.sofkau.implemetacionretoddd.Producto;
import co.com.sofkau.implemetacionretoddd.domain.producto.entities.BonoDescuento;
import co.com.sofkau.implemetacionretoddd.domain.producto.entities.Empaque;
import co.com.sofkau.implemetacionretoddd.domain.producto.entities.ValorProducto;
import co.com.sofkau.implemetacionretoddd.domain.producto.values.*;

public class ProductoBuilder {
    private ProductoId productoId;
    private NombreProducto nombreProducto;
    private BonoDescuento bonoDescuento;
    private Empaque empaque;
    private ValorProducto valorProducto;
    private Marca marca;
    private Color color;
    private Talla talla;

    public ProductoBuilder setProductoId(ProductoId productoId) {
        this.productoId = productoId;
        return this;
    }

    public ProductoBuilder setNombreProducto(NombreProducto nombreProducto) {
        this.nombreProducto = nombreProducto;
        return this;
    }

    public ProductoBuilder setBonoDescuento(BonoDescuento bonoDescuento) {
        this.bonoDescuento = bonoDescuento;
        return this;
    }

    public ProductoBuilder setEmpaque(Empaque empaque) {
        this.empaque = empaque;
        return this;
    }

    public ProductoBuilder setValorProducto(ValorProducto valorProducto) {
        this.valorProducto = valorProducto;
        return this;
    }

    public ProductoBuilder setMarca(Marca marca) {
        this.marca = marca;
        return this;
    }

    public ProductoBuilder setColor(Color color) {
        this.color = color;
        return this;
    }

    public ProductoBuilder setTalla(Talla talla) {
        this.talla = talla;
        return this;
    }

    public Producto createProducto() {
        return new Producto(productoId, nombreProducto, bonoDescuento, empaque, valorProducto, marca, color, talla);
    }
}