package co.com.sofkau.implemetacionretoddd.domain.producto.usecases;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofkau.implemetacionretoddd.domain.producto.Producto;
import co.com.sofkau.implemetacionretoddd.domain.producto.commands.CambiarColorProducto;
import co.com.sofkau.implemetacionretoddd.domain.producto.commands.CambiarMarcaProducto;

public final class CambiarMarcaProductoUseCase extends UseCase<RequestCommand<CambiarMarcaProducto>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<CambiarMarcaProducto> cambiarMarcaProductoUseCaseRequestCommand){
        var command = cambiarMarcaProductoUseCaseRequestCommand.getCommand();
        var producto = Producto.from(command.getProductoId(), retrieveEvents(command.getProductoId().value()));
        producto.modificarMarca(
                command.getProductoId(),
                command.getMarca()
        );

        emit().onResponse(new ResponseEvents(producto.getUncommittedChanges()));
    }
}
