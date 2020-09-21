
package Modelo;

import java.sql.Date;
import java.sql.Timestamp;


public class Empleado extends Persona{
    private int codEmpleado;
    private String cedualEmpleado;
    private Timestamp horaEntradaPre;
    private Timestamp horaSalidaPre;
    private int codRegistro;

    public Empleado() {
    }

    public Empleado(int codEmpleado, String cedualEmpleado, Timestamp horaEntradaPre, Timestamp horaSalidaPre, int codRegistro, String Cedula, String Nombre, String Apellido, String Celular, String Correo, String Sexo, Date fechaNacimiento, int edad) {
        super(Cedula, Nombre, Apellido, Celular, Correo, Sexo, fechaNacimiento, edad);
        this.codEmpleado = codEmpleado;
        this.cedualEmpleado = cedualEmpleado;
        this.horaEntradaPre = horaEntradaPre;
        this.horaSalidaPre = horaSalidaPre;
        this.codRegistro = codRegistro;
    }

    public int getCodEmpleado() {
        return codEmpleado;
    }

    public void setCodEmpleado(int codEmpleado) {
        this.codEmpleado = codEmpleado;
    }

    public String getCedualEmpleado() {
        return cedualEmpleado;
    }

    public void setCedualEmpleado(String cedualEmpleado) {
        this.cedualEmpleado = cedualEmpleado;
    }

    public Timestamp getHoraEntradaPre() {
        return horaEntradaPre;
    }

    public void setHoraEntradaPre(Timestamp horaEntradaPre) {
        this.horaEntradaPre = horaEntradaPre;
    }

    public Timestamp getHoraSalidaPre() {
        return horaSalidaPre;
    }

    public void setHoraSalidaPre(Timestamp horaSalidaPre) {
        this.horaSalidaPre = horaSalidaPre;
    }

    public int getCodRegistro() {
        return codRegistro;
    }

    public void setCodRegistro(int codRegistro) {
        this.codRegistro = codRegistro;
    }
    
    
    
}
