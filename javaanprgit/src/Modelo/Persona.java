
package Modelo;


public class Persona {
    
    // Atributos
    private String Cedula;
    private String Nombre;
    private String Apellido;
    private String Telefono;
    private String Celular;
    private String Correo;

    public Persona() {
    }

    public Persona(String Cedula, String Nombre, String Apellido, String Telefono, String Celular, String Correo) {
        this.Cedula = Cedula;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Telefono = Telefono;
        this.Celular = Celular;
        this.Correo = Correo;
    }

// Setter

    public void setCedula(String Cedula) {
        this.Cedula = Cedula;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public void setCelular(String Celular) {
        this.Celular = Celular;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

// Getters

    public String getCedula() {
        return Cedula;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public String getTelefono() {
        return Telefono;
    }

    public String getCelular() {
        return Celular;
    }

    public String getCorreo() {
        return Correo;
    }

    
// Metodos Crud
    
    public void RegistrarUsuario(){
        
    }
    
    public void ModificarUsuario(){
        
    }
    
    public void EliminarUsuario(){
        
    }
    
    public void ConsultarUsuario(){
        
    }
}
