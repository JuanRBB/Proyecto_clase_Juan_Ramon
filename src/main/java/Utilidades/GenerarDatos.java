package Utilidades;

import Modelos.*;
import com.github.javafaker.Faker;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class GenerarDatos {

    private static Faker faker = new Faker();

    public static List<Factura> generarFacturaAleatorio(int numFacturas, Cliente cliente, List<LineaFactura> lineaFactura){

        List<Factura> facturaList = new ArrayList<>();

        for(int i = 0 ; i < numFacturas; i++) {

            Factura factura = new Factura();
            factura.setCodigoFactura(String.valueOf(faker.number().numberBetween(5,5)));
            factura.setIdentificador(faker.number().numberBetween(3,3));
            factura.setDescuento(faker.number().randomDouble(2,5,50));
            factura.setCliente(cliente);
            factura.setLineaFactura(lineaFactura);
            facturaList.add(factura);

        }

        return facturaList;
    }

    public static List<Cliente> generarClientesAleatorio(int numClientes){

        List<Cliente> clienteList = new ArrayList<>();

        for (int i = 0 ; i < numClientes; i++){
            Cliente cliente = new Cliente();
            cliente.setIdentificador(faker.number().numberBetween(9,9));
            cliente.setApellidos(faker.cat().name());
            cliente.setTipoCliente(TipoCliente.values()[faker.number().numberBetween(0, 1)]);
            cliente.setNombre(faker.artist().name());
            cliente.setDni(String.valueOf(faker.idNumber()));
            clienteList.add(cliente);
        }

        return clienteList;

    }

    public static List<Almacen> generarAlmacenAleatorio(int numAlmacen){

        List<Almacen> listaAlmacenes = new ArrayList<>();

        for(int i = 0 ; i < numAlmacen; i++){

            Almacen almacen = new Almacen();
            almacen.setIdentificador(faker.number().numberBetween(3,3));
            almacen.setNombre(faker.company().name());
            almacen.setCapacidad(faker.number().numberBetween(100,1000000));

            listaAlmacenes.add(almacen);

        }
        return listaAlmacenes;
    }

    public static List<Producto> generarProductoAleatorio(int numProducto){

        List<Producto> listaProductos = new ArrayList<>();

        for(int i = 0 ; i < numProducto; i++){

            Producto producto = new Producto();
            producto.setAlmacen(generarAlmacenAleatorio(1).get(0));
            producto.setTipoProducto((TipoProducto.values()[faker.number().numberBetween(0,2)]));
            producto.setIdentificador(faker.number().numberBetween(8,8));
            producto.setCodigo(String.valueOf(faker.number().numberBetween(4,4)));
            producto.setPrecio(faker.number().randomDouble(2,1,100));
            producto.setFechaCaducidad(LocalDate.now());
            listaProductos.add(producto);
        }
        return listaProductos;
    }

    public static List<LineaFactura> generarListaFacturaAleatoria(int numLineaFactura) {

        List<LineaFactura> listaLineaFactura = new ArrayList<>();

        for (int i = 0; i < numLineaFactura; i++) {
            LineaFactura lineafactura = new LineaFactura();
            lineafactura.setFactura(generarFacturaAleatorio(1).get(0));
            lineafactura.setIdentificador(faker.number().numberBetween(8, 8));
            lineafactura.setCantidad(faker.number().numberBetween(1, 10));
            lineafactura.setProducto(generarProductoAleatorio(1).get(0));
            listaLineaFactura.add(lineafactura);
        }

        return listaLineaFactura;

    }

    public static List<Contrato> generarContratoAleatoria(int numContratos) {

        List<Contrato> listaContratos = new ArrayList<>();

        for (int i = 0; i < numContratos; i++) {

            Contrato contrato = new Contrato();
            contrato.setIdentificador(faker.number().numberBetween(9, 9));
            contrato.setTipoContrato(TipoContrato.values()[faker.number().numberBetween(0, 3)]);
            contrato.setSalarioBase(faker.number().randomDouble(2, 10000, 1000000));
            listaContratos.add(contrato);
        }
        return listaContratos;
    }

    public static List<Empresa> generarEmpresaAleatoria(int numEmpresas, List<Empleado> empleado) {

        List<Empresa> listaEmpresa = new ArrayList<>();

        for (int i = 0; i < numEmpresas; i++) {

            Empresa empresa = new Empresa();
            empresa.setCodigoEmpresa(String.valueOf(faker.number().numberBetween(8,8)));
            empresa.setTipoEmpresa(TipoEmpresa.values()[faker.number().numberBetween(0,3)]);
            empresa.setIdentificador(faker.number().numberBetween(6,6));
            empresa.setEmpleado(empleado);
            listaEmpresa.add(empresa);
        }
        return listaEmpresa;
    }

    public static List<Empleado> generarEmpleadoAleatorio(int numEmpleados){
        List<Empleado> listaEmpleados = new ArrayList<>();

        for (int i = 0; i < numEmpleados; i++){

            Empleado empleado = new Empleado();
            empleado.setNombre(faker.artist().name());
            empleado.setApellidos(faker.book().title());
            empleado.setContrato(generarContratoAleatoria(1).get(0));
            empleado.setDni(String.valueOf(faker.number().numberBetween(9,9)));
            empleado.setIdentificador(faker.number().numberBetween(6,6));
            empleado.setNumTelefono(String.valueOf(faker.number().numberBetween(9,9)));
            empleado.setEmpresa(generarEmpresaAleatoria(1, [1]).get(0));
            listaEmpleados.add(empleado);
        }

        return listaEmpleados;
    }

}