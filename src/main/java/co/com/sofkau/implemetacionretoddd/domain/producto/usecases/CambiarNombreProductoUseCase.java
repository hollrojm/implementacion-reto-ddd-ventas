package co.com.sofkau.implemetacionretoddd.domain.producto.usecases;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofkau.implemetacionretoddd.domain.producto.Producto;
import co.com.sofkau.implemetacionretoddd.domain.producto.commands.CambiarNombreProducto;

public final class CambiarNombreProductoUseCase extends UseCase<RequestCommand<CambiarNombreProducto>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<CambiarNombreProducto> cambiarNombreProductoUseCaseRequestCommand){
        var command = cambiarNombreProductoUseCaseRequestCommand.getCommand();
        var producto = Producto.from(command.getProductoId(), retrieveEvents(command.getProductoId().value()));
        producto.modificarNombreProducto(
                command.getProductoId(),
                command.getNombreProducto()
        );

        emit().onResponse(new ResponseEvents(producto.getUncommittedChanges()));
    }
}
