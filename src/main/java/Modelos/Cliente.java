package Modelos;

import Modelos.v4.Persona;

import java.util.Objects;

public class Cliente extends Persona {
    private TipoCliente tipoCliente;

    //Constructores

    public Cliente(Integer identificador, String dni, String nombre, String apellidos, String direccion, TipoCliente tipoCliente) {
        super(identificador, dni, nombre, apellidos, direccion);
        this.tipoCliente = tipoCliente;
    }

    public Cliente(){
    }


    //Getters and setter

    public TipoCliente getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(TipoCliente tipoCliente) {
        this.tipoCliente = tipoCliente;
    }


    //equals and hascode

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Cliente cliente = (Cliente) o;
        return tipoCliente == cliente.tipoCliente;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), tipoCliente);
    }


    //toSring

    @Override
    public String toString() {
        return super.toString() +
                "tipoCliente=" + tipoCliente +
                '}';
    }
}
