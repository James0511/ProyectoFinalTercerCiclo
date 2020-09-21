
package Modelo;


public class RegistroEmpleado {
    private int codRegistro;
    private String usuario;
    private String clave;

    public RegistroEmpleado() {
    }

    public RegistroEmpleado(int codRegistro, String usuario, String clave) {
        this.codRegistro = codRegistro;
        this.usuario = usuario;
        this.clave = clave;
    }

    public int getCodRegistro() {
        return codRegistro;
    }

    public void setCodRegistro(int codRegistro) {
        this.codRegistro = codRegistro;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }
    
}
