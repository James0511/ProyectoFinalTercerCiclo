
package Modelo;


public class Color {
    private String codColor;
    private String color;

    public Color() {
    }

    public Color(String codColor, String color) {
        this.codColor = codColor;
        this.color = color;
    }

    public String getCodColor() {
        return codColor;
    }

    public void setCodColor(String codColor) {
        this.codColor = codColor;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    
}
