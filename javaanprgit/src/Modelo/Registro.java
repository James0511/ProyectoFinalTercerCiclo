
package Modelo;


public class Registro {
    
    // Atributos
    private int Cod_Usuario;
    private String Usuario;
    private String Contasena;
    private String HoraEntradaEm;
    private String HoraSalidaEm;
    private String HorasLaboradas;
    private String HorasTarde;

    public Registro() {
    }
    
    public Registro(int Cod_Usuario, String Usuario, String Contasena, String HoraEntradaEm, String HoraSalidaEm, String HorasLaboradas, String HorasTarde) {
        this.Cod_Usuario = Cod_Usuario;
        this.Usuario = Usuario;
        this.Contasena = Contasena;
        this.HoraEntradaEm = HoraEntradaEm;
        this.HoraSalidaEm = HoraSalidaEm;
        this.HorasLaboradas = HorasLaboradas;
        this.HorasTarde = HorasTarde;
    }
    
// Setters

    public void setCod_Usuario(int Cod_Usuario) {
        this.Cod_Usuario = Cod_Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public void setContasena(String Contasena) {
        this.Contasena = Contasena;
    }

    public void setHoraEntradaEm(String HoraEntradaEm) {
        this.HoraEntradaEm = HoraEntradaEm;
    }

    public void setHoraSalidaEm(String HoraSalidaEm) {
        this.HoraSalidaEm = HoraSalidaEm;
    }

    public void setHorasLaboradas(String HorasLaboradas) {
        this.HorasLaboradas = HorasLaboradas;
    }

    public void setHorasTarde(String HorasTarde) {
        this.HorasTarde = HorasTarde;
    }
    
// Getters 

    public int getCod_Usuario() {
        return Cod_Usuario;
    }

    public String getUsuario() {
        return Usuario;
    }

    public String getContasena() {
        return Contasena;
    }

    public String getHoraEntradaEm() {
        return HoraEntradaEm;
    }

    public String getHoraSalidaEm() {
        return HoraSalidaEm;
    }

    public String getHorasLaboradas() {
        return HorasLaboradas;
    }

    public String getHorasTarde() {
        return HorasTarde;
    }
    
    
}
