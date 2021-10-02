package co.com.sofkau.implemetacionretoddd.domain.producto.usecases;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofkau.implemetacionretoddd.domain.producto.Producto;
import co.com.sofkau.implemetacionretoddd.domain.producto.commands.CambiarValorBonoDescuento;

public final class CambiarValorBonoDescuentoUseCase extends UseCase<RequestCommand<CambiarValorBonoDescuento>, ResponseEvents> {



        @Override
        public void executeUseCase(RequestCommand<CambiarValorBonoDescuento> cambiarValorBonoDescuentoRequestCommand){
            var command = cambiarValorBonoDescuentoRequestCommand.getCommand();
            var producto = Producto.from(command.getProductoId(), retrieveEvents(command.getBonoDescuentoId().value()));
            producto.modificarValorBonoDescuento(
                    command.getBonoDescuentoId(),
                    command.getValorBonoDescuento()
            );

            emit().onResponse(new ResponseEvents(producto.getUncommittedChanges()));
        }
    }

