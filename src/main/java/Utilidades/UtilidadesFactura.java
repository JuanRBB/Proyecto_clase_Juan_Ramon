package Utilidades;

import Modelos.Factura;
import Modelos.LineaFactura;

import java.time.LocalDate;

public class UtilidadesFactura {

     public boolean esFacturaVencida (Factura factura){
         if (factura.getFechaVencimiento().equals(LocalDate.now())){
             return true;
         }else if(factura.getFechaVencimiento().isAfter(LocalDate.now())){
             return true;
         }else{ return false; }
     }

     public double calcularBaseFacturas(Factura factura) {

         double precio = 0;
         double precioFinal = 0;
         int cantidad = 0;

         for (LineaFactura lineaFactura : factura.getLineaFactura()) {
             precio += lineaFactura.getProducto().getPrecio();
             cantidad += lineaFactura.getCantidad();
             precioFinal += precio * cantidad;
         }
         return precioFinal;
     }

     public double calcularTotalAPagar(Factura factura){

         double total = 0;

         total += (calcularBaseFacturas(factura)-factura.getDescuento())*factura.getIva();

         return total;
     }
}

