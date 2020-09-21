
package Modelo;

import java.sql.Date;


public class Cliente extends Persona{
    private int codCliente;
    private String cedulaCliente;
    private int codTipoCliente;

    public Cliente() {
    }

    public Cliente(int codCliente, String cedulaCliente, int codTipoCliente, String Cedula, String Nombre, String Apellido, String Celular, String Correo, String Sexo, Date fechaNacimiento, int edad) {
        super(Cedula, Nombre, Apellido, Celular, Correo, Sexo, fechaNacimiento, edad);
        this.codCliente = codCliente;
        this.cedulaCliente = cedulaCliente;
        this.codTipoCliente = codTipoCliente;
    }

    public int getCodCliente() {
        return codCliente;
    }

    public void setCodCliente(int codCliente) {
        this.codCliente = codCliente;
    }

    public String getCedulaCliente() {
        return cedulaCliente;
    }

    public void setCedulaCliente(String cedulaCliente) {
        this.cedulaCliente = cedulaCliente;
    }

    public int getCodTipoCliente() {
        return codTipoCliente;
    }

    public void setCodTipoCliente(int codTipoCliente) {
        this.codTipoCliente = codTipoCliente;
    }
    
}
