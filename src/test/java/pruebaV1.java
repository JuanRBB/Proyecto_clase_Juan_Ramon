import Modelos.*;

import java.time.LocalDate;

public class pruebaV1 {

    public static void main(String[] args) {

        //Creación del objeto con sus caracteristicas
        Almacen almacen1 = new Almacen(435631, "Pernia",30000000);
        Cliente cliente1 = new Cliente(54, "781925368N", "Israel", "Lora", "Pino Montano", TipoCliente.Particular);
        Producto producto1 = new Producto(6273, "178923", LocalDate.of(1998,06,22), TipoProducto.Alimentacion, almacen1);

        //Impresion por consola
        System.out.println(almacen1+"\n"+cliente1+"\n"+producto1);
    }

}
