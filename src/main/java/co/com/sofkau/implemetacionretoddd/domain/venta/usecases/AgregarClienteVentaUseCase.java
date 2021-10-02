package co.com.sofkau.implemetacionretoddd.domain.venta.usecases;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofkau.implemetacionretoddd.domain.venta.VentaProducto;
import co.com.sofkau.implemetacionretoddd.domain.venta.commands.AgregarClienteVenta;
import co.com.sofkau.implemetacionretoddd.domain.venta.values.VentaId;

public final class AgregarClienteVentaUseCase extends UseCase<RequestCommand<AgregarClienteVenta>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<AgregarClienteVenta> agregarClienteVentaRequestCommand) {
        var command = agregarClienteVentaRequestCommand.getCommand();
        var ventaProducto = VentaProducto.from(command.getVentaId(), retrieveEvents(command.getClienteId().value()));
        ventaProducto.agregarCliente(command.getClienteId(), command.getNombre(), command.getCorreoElectronico(), command.getDireccion(), command.getTelefono());
    }


}
