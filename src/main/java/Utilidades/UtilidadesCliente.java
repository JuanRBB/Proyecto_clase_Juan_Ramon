package Utilidades;
import Modelos.Cliente;

public class UtilidadesCliente {

    public boolean esDniValido(Cliente cliente) {

        if(cliente.getDni().length() == 9 && cliente.getDni().substring(0,7).matches("[0-9]") && cliente.getDni().substring(8).matches("[a-zA-Z]")){
            return true;
        }
        return false;
    }
}
