
package Modelo;


public class Automovil {
    private String placa;
    private String color;
    private int marca;
    private int codCliente;

    public Automovil() {
    }

    public Automovil(String placa, String color, int marca, int codCliente) {
        this.placa = placa;
        this.color = color;
        this.marca = marca;
        this.codCliente = codCliente;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMarca() {
        return marca;
    }

    public void setMarca(int marca) {
        this.marca = marca;
    }

    public int getCodCliente() {
        return codCliente;
    }

    public void setCodCliente(int codCliente) {
        this.codCliente = codCliente;
    }
    
    
    
}
