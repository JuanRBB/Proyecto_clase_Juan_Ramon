package Utilidades;

import Modelos.*;

import java.util.ArrayList;
import java.util.List;

public class UtilidadesProducto {

    public List<Producto>getPorTipo(List<Producto> productos, TipoProducto tipo){

        List listaProductos = new ArrayList<>(productos);

        for(Producto producto1: productos){
            if(producto1.getTipoProducto().equals(tipo)){
                listaProductos.add(productos);
            }
        }

        return listaProductos;

    }

    public List<Producto>getPorAlmacen(List<Producto> productos, Almacen almacen){

        List listaAlmacen = new ArrayList<>(productos);

        for(Producto producto2: productos){
            if (producto2.getAlmacen().equals(almacen)){
                listaAlmacen.add(producto2);
            }
        }

        return listaAlmacen;
    }

}
