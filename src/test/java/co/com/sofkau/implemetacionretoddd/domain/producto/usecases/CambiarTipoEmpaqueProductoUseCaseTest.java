package co.com.sofkau.implemetacionretoddd.domain.producto.usecases;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofkau.implemetacionretoddd.domain.producto.commands.CambiarNombreProducto;
import co.com.sofkau.implemetacionretoddd.domain.producto.commands.CambiarTipoEmpaqueProducto;
import co.com.sofkau.implemetacionretoddd.domain.producto.events.NombreProductoModificado;
import co.com.sofkau.implemetacionretoddd.domain.producto.events.ProductoAgregado;
import co.com.sofkau.implemetacionretoddd.domain.producto.events.TipoEmpaqueModificado;
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

class CambiarTipoEmpaqueProductoUseCaseTest  {

    private static final String ID_PRODUCTO ="1111-1111";
    private static final String ID_EMPAQUE ="1";
    @Mock
    private DomainEventRepository repository;

    @Test
    @DisplayName("Valida la funcionalidad para cambiar el tipo de Empaque del producto")
    public void happyChangeTipoEmpaque() {

        //arrage
        var command = new CambiarTipoEmpaqueProducto(
                ProductoId.of(ID_PRODUCTO),
                EmpaqueId.of(ID_EMPAQUE),
                new TipoEmpaque("Caja")
        );

        var cambiarTipoEmpaqueProductoUseCase = new CambiarTipoEmpaqueProductoUseCase();

        when(repository.getEventsBy(ID_EMPAQUE)).thenReturn(events());
        cambiarTipoEmpaqueProductoUseCase.addRepository(repository);
        //act

        var response = UseCaseHandler.getInstance()
                .setIdentifyExecutor(ID_EMPAQUE)
                .syncExecutor(cambiarTipoEmpaqueProductoUseCase, new RequestCommand<>(command))
                .orElseThrow();

        //assert
        var event = (TipoEmpaqueModificado) response.getDomainEvents().get(0);

        Assertions.assertEquals("Caja", event.getTipoEmpaque().value());
        Assertions.assertEquals("almacenropa.producto.tipoempaqueactualizado", event.type);

    }

    private List<DomainEvent> events() {
        return List.of(new ProductoAgregado(
                new ProductoId(ID_PRODUCTO),
                new NombreProducto("Camisa"),
                new BonoDescuentoId("1"),
                new ValorBonoDescuento(10000F),
                new EmpaqueId(ID_EMPAQUE),
                new TipoEmpaque("Bolsa"),
                new ValorProductoId("1"),
                new ValorUnitario(50000F),
                new Marca("Zara"),
                new Color("Amarillo"),
                new Talla("XL")
        ));
    }

}