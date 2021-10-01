package co.com.sofkau.implemetacionretoddd.usecasetest;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofkau.implemetacionretoddd.domain.producto.commands.CrearProducto;
import co.com.sofkau.implemetacionretoddd.domain.producto.events.ProductoAgregado;
import co.com.sofkau.implemetacionretoddd.domain.producto.usecases.CrearProductoUseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofkau.implemetacionretoddd.domain.producto.values.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public final class CrearProductoUseCaseTest {
    private static final String ID_PRODUCTO = "8012042";

    @Mock
    private DomainEventRepository repository;


    @Test
    @DisplayName("Esta prueba para valida crear un producto")
    void happyCreateProduct(){
        //arrange

        var command = new CrearProducto(
                ProductoId.of(ID_PRODUCTO),
                new NombreProducto("Camisa"),
                new BonoDescuentoId("1"),
                new ValorBonoDescuento(10000F),
                new EmpaqueId("1"),
                new TipoEmpaque("Caja"),
                new ValorProductoId("1"),
                new ValorUnitario(150000F),
                new Marca("Chevinon"),
                new Color("Negro"),
                new Talla("M")
        );
        var useCase = new CrearProductoUseCase();

        //act
        var events = UseCaseHandler.getInstance()
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();

        //assert
        var event = (ProductoAgregado) events.get(0);
        Assertions.assertEquals("Camisa",event.getNombreProducto().value());
        Assertions.assertEquals("1",event.getBonoDescuentoId().value());
        Assertions.assertEquals(10000F,event.getValorBonoDescuento().value());
        Assertions.assertEquals("1",event.getEmpaqueId().value());
        Assertions.assertEquals("Caja",event.getTipoEmpaque().value());
        Assertions.assertEquals("1",event.getValorProductoId().value());
        Assertions.assertEquals(150000F,event.getValorUnitario().value());
        Assertions.assertEquals("Chevinon",event.getMarca().value());
        Assertions.assertEquals("Negro",event.getColor().value());
        Assertions.assertEquals("M",event.getTalla().value());

    }





}

