
package Modelo;


public class Trabajador extends Persona{
    
    //Atributos
    private String Horario;

    public Trabajador() {
    }

    public Trabajador(String Horario, String Cedula, String Nombre, String Apellido, String Telefono, String Celular, String Correo) {
        super(Cedula, Nombre, Apellido, Telefono, Celular, Correo);
        this.Horario = Horario;
    }
    
// Setter

    public void setHorario(String Horario) {
        this.Horario = Horario;
    }
    
// Getter

    public String getHorario() {
        return Horario;
    }
    
// Metodo de crear Trabajador
    
    public void CrearTrabajdor(){
        
    }
}
