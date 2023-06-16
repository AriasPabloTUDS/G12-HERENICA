/*
• Método comprobarColor(String color): comprueba que el color es correcto, y si no lo es,
usa el color blanco por defecto. Los colores disponibles para los electrodomésticos son
blanco, negro, rojo, azul y gris. No importa si el nombre está en mayúsculas o en
minúsculas. Este método se invocará al crear el objeto y no será visible.
 */
package Entidades.Enum;

/**
 *
 * @author Pablo
 */
public enum Color {
    
    BLANCO("blanco"), NEGRO("negro"), ROJO("rojo"), AZUL("azul"), GRIS("gris");
    
    private String nombre;

    private Color() {
    }

    private Color(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
