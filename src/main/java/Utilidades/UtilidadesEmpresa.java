package Utilidades;

import Modelos.Empleado;
import Modelos.Empresa;
import Modelos.TipoContrato;

import java.util.*;

public class UtilidadesEmpresa {
    public List<Empleado>getEmpleadosPorContrato(Empresa empresa, TipoContrato tipoContrato){

        List<Empleado> trabajadores = new ArrayList<>();

        for(Empleado trabajador: empresa.getEmpleado()){
            if(trabajador.getContrato().getTipoContrato().equals(tipoContrato)){
                trabajadores.add(trabajador);
            }
        }
        return trabajadores;
    }

    public List<Empleado>getMileuristaOrdenadosPorSalarios(Empresa empresa){

        List<Empleado> mileurista = new ArrayList<>();

        for(Empleado empleado: empresa.getEmpleado()){
            if(empleado.getContrato().getSalarioBase()>=1000){
                mileurista.add(empleado);
            }
        }

        mileurista.sort(Comparator.comparing(e->e.getContrato().getSalarioBase()));

        return mileurista;

    }

    public double fondoSalarialEmpresa (Empresa empresa){

        Double sumaTotal = 0.0;

        for (Empleado empleado: empresa.getEmpleado()){
            sumaTotal += empleado.getContrato().getSalarioBase();
        }
        return sumaTotal;
    }

    public Empleado getMejorEmpleadoPagado(List<Empresa> empresas){

        Empleado mejorPAgado;
        List<Empleado> empleadores = new ArrayList<>();

        for (Empresa empresa: empresas){
            for (Empleado empleado: empresa.getEmpleado()){
                empleadores.add(empleado);
            }
        }

        empleadores.sort(Comparator.comparing(e->e.getContrato().getSalarioBase()));
        mejorPAgado = empleadores.get(0);

         return mejorPAgado;
    }
    public Map<TipoContrato, List<Empleado>> getEmpleadosPorTipoContrato(Empresa empresas){

        Map<TipoContrato, List<Empleado>> empleadoContrato = new HashMap<>();

        for (TipoContrato tipoContrato : TipoContrato.values()){
            empleadoContrato.put(tipoContrato,new ArrayList<>());
        }

        for(Empleado empleado: empresas.getEmpleado()){
            empleadoContrato.get(TipoContrato.values()).add(empleado);
        }
        return empleadoContrato;
    }

    public Map<Empresa, Map<TipoContrato, List<Empleado>>> getEmpleadosPorTipoContrato(List<Empresa> empresas){

        Map<Empresa, Map<TipoContrato, List<Empleado>>> empleadoContrato = new HashMap<>();

        for (TipoContrato tipoContratos : TipoContrato.values()){
            empleadoContrato.put(getEmpleadosPorTipoContrato());
        }

        for(Empresa empresas: empresas){

        }



        return empleadoContrato;
    }
}
