package co.com.sofkau.implemetacionretoddd.domain.venta.usecases;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofkau.implemetacionretoddd.domain.venta.commands.AgregarClienteVenta;
import co.com.sofkau.implemetacionretoddd.domain.venta.entities.genericvalues.Direccion;
import co.com.sofkau.implemetacionretoddd.domain.venta.entities.genericvalues.Nombre;
import co.com.sofkau.implemetacionretoddd.domain.venta.events.ClienteAgregado;
import co.com.sofkau.implemetacionretoddd.domain.venta.events.VentaCreada;
import co.com.sofkau.implemetacionretoddd.domain.venta.values.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class AgregarClienteVentaUseCaseTest {

    private static final String ID_CLIENTE = "1111-1111";
    @Mock
    private DomainEventRepository repository;

    @Test
    @DisplayName("Esta prueba valida la funcionalidad de agergar cliente a la venta")
    void happyAggregateClienteEnVenta() {
        //arrange
        var command = new AgregarClienteVenta(
                VentaId.of("111-111"),
                new ClienteId(ID_CLIENTE),
                new Nombre("Hollman"),
                new CorreoElectronico("hollman@gmail.com"),
                new Direccion("calle 6 #5-42"),
                new Telefono("3337880")

        );
        var useCase = new AgregarClienteVentaUseCase();
        when(repository.getEventsBy(ID_CLIENTE)).thenReturn(EventStored());
        useCase.addRepository(repository);

        //act
        var events = UseCaseHandler.getInstance()
                .setIdentifyExecutor(ID_CLIENTE)
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();

        //assert
        var eventClienteAgregado = (ClienteAgregado) events.get(0);
        Assertions.assertEquals(ID_CLIENTE, eventClienteAgregado.getClienteId().value());
        Assertions.assertEquals("Hollman", eventClienteAgregado.getNombre().value());
        Assertions.assertEquals("hollman@gmail.com", eventClienteAgregado.getCorreoElectronico().value());
        Assertions.assertEquals("calle 6 #5-42", eventClienteAgregado.getDireccion().value());
        Assertions.assertEquals("3337880", eventClienteAgregado.getTelefono().value());

        Mockito.verify(repository).getEventsBy(ID_CLIENTE);
    }

    private List<DomainEvent> EventStored() {
        return List.of(
                new VentaCreada(
                        new VentaId("111-111"),
                        new Descuento(50000F),
                        new Cantidad("10")

                )
        );
    }
}