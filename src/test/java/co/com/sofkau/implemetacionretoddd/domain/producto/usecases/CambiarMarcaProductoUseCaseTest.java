package co.com.sofkau.implemetacionretoddd.domain.producto.usecases;


import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofkau.implemetacionretoddd.domain.producto.commands.CambiarMarcaProducto;
import co.com.sofkau.implemetacionretoddd.domain.producto.events.MarcaModificada;
import co.com.sofkau.implemetacionretoddd.domain.producto.events.ProductoAgregado;
import co.com.sofkau.implemetacionretoddd.domain.producto.usecases.CambiarMarcaProductoUseCase;
import co.com.sofkau.implemetacionretoddd.domain.producto.values.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public final class CambiarMarcaProductoUseCaseTest {

    @Mock
    private DomainEventRepository repository;

    @Test
    @DisplayName("Valida la funcionalidad para cambiar la marca del producto")
    public void happyChangeColor() {
        //arrage
        var command = new CambiarMarcaProducto(
                ProductoId.of("666-666"),
                new Marca("Pat-Primo")
        );

        var cambiarMarcaProductoUseCase = new CambiarMarcaProductoUseCase();

        when(repository.getEventsBy("666-666")).thenReturn(events());
        cambiarMarcaProductoUseCase.addRepository(repository);
        //act
        var response = UseCaseHandler.getInstance()
                .setIdentifyExecutor("666-666")
                .syncExecutor(cambiarMarcaProductoUseCase, new RequestCommand<>(command))
                .orElseThrow();

        //assert
        var event = (MarcaModificada) response.getDomainEvents().get(0);

        Assertions.assertEquals("Pat-Primo", event.getMarca().value());
        Assertions.assertEquals("almacenropa.producto.marcaactualizada", event.type);

    }

    private List<DomainEvent> events() {
        return List.of(new ProductoAgregado(
                new ProductoId("666-666"),
                new NombreProducto("Camiseta"),
                new BonoDescuentoId("1"),
                new ValorBonoDescuento(10000F),
                new EmpaqueId("1"),
                new TipoEmpaque("Caja"),
                new ValorProductoId("1"),
                new ValorUnitario(50000F),
                new Marca("Zara"),
                new Color("Amarillo"),
                new Talla("XL")
        ));
    }
}
