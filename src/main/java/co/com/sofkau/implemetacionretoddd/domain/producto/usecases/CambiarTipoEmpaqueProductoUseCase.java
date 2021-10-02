package co.com.sofkau.implemetacionretoddd.domain.producto.usecases;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofkau.implemetacionretoddd.domain.producto.Producto;
import co.com.sofkau.implemetacionretoddd.domain.producto.commands.CambiarTipoEmpaqueProducto;

public final class CambiarTipoEmpaqueProductoUseCase extends UseCase<RequestCommand<CambiarTipoEmpaqueProducto>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<CambiarTipoEmpaqueProducto> cambiarTipoEmpaqueProductoRequestCommand){
        var command = cambiarTipoEmpaqueProductoRequestCommand.getCommand();
        var producto = Producto.from(command.getProductoId(), retrieveEvents(command.getEmpaqueId().value()));
        producto.modificarTipoEmpaque(
                command.getEmpaqueId(),
                command.getTipoEmpaque()
        );

        emit().onResponse(new ResponseEvents(producto.getUncommittedChanges()));
    }

}
