
package Modelo;


public class Usuario extends Persona{
    
    // Atributos
    private String TipoUsuario;


    public Usuario() {
    }

    public Usuario(String TipoUsuario, String Cedula, String Nombre, String Apellido, String Telefono, String Celular, String Correo) {
        super(Cedula, Nombre, Apellido, Telefono, Celular, Correo);
        this.TipoUsuario = TipoUsuario;

    }

//Setters
    
    public void setTipoUsuario(String TipoUsuario) {
        this.TipoUsuario = TipoUsuario;
    }


//Getter
    
    public String getTipoUsuario() {
        return TipoUsuario;
    }

     
}
