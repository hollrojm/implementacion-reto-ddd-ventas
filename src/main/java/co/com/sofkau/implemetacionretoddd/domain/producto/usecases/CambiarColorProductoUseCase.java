package co.com.sofkau.implemetacionretoddd.domain.producto.usecases;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofkau.implemetacionretoddd.domain.producto.Producto;
import co.com.sofkau.implemetacionretoddd.domain.producto.commands.CambiarColorProducto;



public class CambiarColorProductoUseCase extends UseCase<RequestCommand<CambiarColorProducto>, ResponseEvents> {


    @Override
    public void executeUseCase(RequestCommand<CambiarColorProducto> cambiarColorProductoUseCaseRequestCommand){
        var command = cambiarColorProductoUseCaseRequestCommand.getCommand();
        var producto = Producto.from(command.getProductoId(), retrieveEvents(command.getProductoId().value()));
        producto.modificarColor(
                command.getProductoId(),
                command.getColor()
        );
        emit().onResponse(new ResponseEvents(producto.getUncommittedChanges()));
    }
}
