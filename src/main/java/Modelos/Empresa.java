package Modelos;

import java.util.List;
import java.util.Objects;

public class Empresa {

    private Integer identificador;
    private String codigoEmpresa;
    private List<Empleado> empleado;
    private TipoEmpresa tipoEmpresa;

    public Empresa(Integer identificador, String codigoEmpresa, List<Empleado> empleado, TipoEmpresa tipoEmpresa) {
        this.identificador = identificador;
        this.codigoEmpresa = codigoEmpresa;
        this.empleado = empleado;
        this.tipoEmpresa = tipoEmpresa;
    }

    public Empresa(){
    }

    public Integer getIdentificador() {
        return identificador;
    }

    public void setIdentificador(Integer identificador) {
        this.identificador = identificador;
    }

    public String getCodigoEmpresa() {
        return codigoEmpresa;
    }

    public void setCodigoEmpresa(String codigoEmpresa) {
        this.codigoEmpresa = codigoEmpresa;
    }

    public List<Empleado> getEmpleado() {
        return empleado;
    }

    public void setEmpleado(List<Empleado> empleado) {
        this.empleado = empleado;
    }

    public TipoEmpresa getTipoEmpresa() {
        return tipoEmpresa;
    }

    public void setTipoEmpresa(TipoEmpresa tipoEmpresa) {
        this.tipoEmpresa = tipoEmpresa;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Empresa empresa = (Empresa) o;
        return Objects.equals(identificador, empresa.identificador) && Objects.equals(codigoEmpresa, empresa.codigoEmpresa) && Objects.equals(empleado, empresa.empleado) && tipoEmpresa == empresa.tipoEmpresa;
    }

    @Override
    public int hashCode() {
        return Objects.hash(identificador, codigoEmpresa, empleado, tipoEmpresa);
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "identificador=" + identificador +
                ", codigoEmpresa='" + codigoEmpresa + '\'' +
                ", empleado=" + empleado +
                ", tipoEmpresa=" + tipoEmpresa +
                '}';
    }
}
