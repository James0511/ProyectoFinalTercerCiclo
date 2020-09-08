
package Modelo;


public class Automovil {
    
    // Atributos
    private String Placa;
    private String Modelo;
    private String Color;
    private String Marcar;

    public Automovil() {
    }

    public Automovil(String Placa, String Modelo, String Color, String Marcar) {
        this.Placa = Placa;
        this.Modelo = Modelo;
        this.Color = Color;
        this.Marcar = Marcar;
    }

// Settes
    
    public void setPlaca(String Placa) {
        this.Placa = Placa;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public void setMarcar(String Marcar) {
        this.Marcar = Marcar;
    }

//Getters
    
    public String getPlaca() {
        return Placa;
    }

    public String getModelo() {
        return Modelo;
    }

    public String getColor() {
        return Color;
    }

    public String getMarca() {
        return Marcar;
    }
    
// Crud Vehiculos
    
    public void RegistrarVehiculos(){
        
    }
    
    public void ModificarVehiculos(){
        
    }
    
    public void EliminarVehiculos(){
        
    }
    
    public void ConsultarVehiculos(){
        
    }
}
