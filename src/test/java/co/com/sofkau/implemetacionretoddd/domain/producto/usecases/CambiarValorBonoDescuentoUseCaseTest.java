package co.com.sofkau.implemetacionretoddd.domain.producto.usecases;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofkau.implemetacionretoddd.domain.producto.commands.CambiarNombreProducto;
import co.com.sofkau.implemetacionretoddd.domain.producto.commands.CambiarValorBonoDescuento;
import co.com.sofkau.implemetacionretoddd.domain.producto.events.NombreProductoModificado;
import co.com.sofkau.implemetacionretoddd.domain.producto.events.ProductoAgregado;
import co.com.sofkau.implemetacionretoddd.domain.producto.events.ValorBonoDescuentoModificado;
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
class CambiarValorBonoDescuentoUseCaseTest {

    private static final String ID_PRODUCTO ="1111-1111";
    @Mock
    private DomainEventRepository repository;

    @Test
    @DisplayName("Valida la modificacion  del valor Bono del producto")
    public void happyChangeValorBono() {

        //arrage
        var command = new CambiarValorBonoDescuento(
                ProductoId.of(ID_PRODUCTO),
                BonoDescuentoId.of("1"),
                new ValorBonoDescuento(10000F)
        );

        var cambiarValorBonoDescuentoUseCase  = new CambiarValorBonoDescuentoUseCase();

        when(repository.getEventsBy("1")).thenReturn(events());
        cambiarValorBonoDescuentoUseCase.addRepository(repository);
        //act

        var response = UseCaseHandler.getInstance()
                .setIdentifyExecutor("1")
                .syncExecutor(cambiarValorBonoDescuentoUseCase, new RequestCommand<>(command))
                .orElseThrow();

        //assert
        var event = (ValorBonoDescuentoModificado) response.getDomainEvents().get(0);

        Assertions.assertEquals(10000F, event.getValorBonoDescuento().value());
        Assertions.assertEquals("almacenropa.producto.valorbonodedescuentoactualizado", event.type);

    }

    private List<DomainEvent> events() {
        return List.of(new ProductoAgregado(
                new ProductoId(ID_PRODUCTO),
                new NombreProducto("Camisa"),
                new BonoDescuentoId("1"),
                new ValorBonoDescuento(5000F),
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