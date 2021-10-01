package co.com.sofkau.implemetacionretoddd.domain.producto.usecases;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofkau.implemetacionretoddd.domain.producto.Producto;
import co.com.sofkau.implemetacionretoddd.domain.producto.commands.CrearProducto;
import co.com.sofka.business.support.ResponseEvents;

public class CrearProductoUseCase extends UseCase<RequestCommand<CrearProducto>,ResponseEvents> {


    @Override
    public void executeUseCase(RequestCommand<CrearProducto>
                               crearProductoRequestCommand) {

    var command = crearProductoRequestCommand.getCommand();
    var producto = new Producto(command.getProductoId(), command.getNombreProducto(), command.getBonoDescuentoId(),
            command.getValorBonoDescuento(), command.getEmpaqueId(), command.getTipoEmpaque(), command.getValorProductoId(),
            command.getValorUnitario(), command.getMarca(), command.getColor(), command.getTalla());

    emit().onResponse(new ResponseEvents(producto.getUncommittedChanges()));
    }


}
