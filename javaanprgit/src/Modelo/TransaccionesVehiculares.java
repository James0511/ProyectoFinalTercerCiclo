
package Modelo;

import java.time.Clock;

public class TransaccionesVehiculares {
    
    // Atributos
    private int Cod_Tran_Vehicular;
    private String Hora_Entrada;
    private String Hora_Salida;
    private String Fecha;

    public TransaccionesVehiculares() {
    }

    public TransaccionesVehiculares(int Cod_Tran_Vehicular, String Hora_Entrada, String Hora_Salida, String Fecha) {
        this.Cod_Tran_Vehicular = Cod_Tran_Vehicular;
        this.Hora_Entrada = Hora_Entrada;
        this.Hora_Salida = Hora_Salida;
        this.Fecha = Fecha;
    }

// Setters
    
    public void setCod_Tran_Vehicular(int Cod_Tran_Vehicular) {
        this.Cod_Tran_Vehicular = Cod_Tran_Vehicular;
    }

    public void setHora_Entrada(String Hora_Entrada) {
        this.Hora_Entrada = Hora_Entrada;
    }

    public void setHora_Salida(String Hora_Salida) {
        this.Hora_Salida = Hora_Salida;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }
    
// Getters

    public int getCod_Tran_Vehicular() {
        return Cod_Tran_Vehicular;
    }

    public String getHora_Entrada() {
        return Hora_Entrada;
    }

    public String getHora_Salida() {
        return Hora_Salida;
    }

    public String getFecha() {
        return Fecha;
    }
    
//metodos para en registro de la entrada y salida de vehiculos
    
    public void DetectarPlacas(){
        
    }
    
    public void RegistrarPlaca(){
        
    }
    
    public void GuardarTransaccion(){
        
    }
}
