/*
 Crear una superclase llamada Electrodoméstico con los siguientes atributos: precio, color,
consumo energético (letras entre A y F) y peso.
Los constructores que se deben implementar son los siguientes:
• Un constructor vacío.
• Un constructor con todos los atributos pasados por parámetro.
Los métodos a implementar son:
• Métodos getters y setters de todos los atributos.
• Método comprobarConsumoEnergetico(char letra): comprueba que la letra es correcta,
sino es correcta usara la letra F por defecto. Este método se debe invocar al crear el
objeto y no será visible.

 */
package Entidades;

import Entidades.Enum.Color;
import java.util.Objects;

/**
 *
 * @author Pablo
 */
public class Electrodomestico {

    protected Double precio;
    protected String color;
    protected Character consumoEnergetico;
    protected int peso;
    protected Character[] letraConsumo = {'A', 'B', 'C', 'D', 'E', 'F'};

    //    • Método comprobarConsumoEnergetico(char letra): comprueba que la letra es correcta,
//sino es correcta usara la letra F por defecto. Este método se debe invocar al crear el
//objeto y no será visible.
    private void comprobarConsumoEnergetico(Character letra) {
        boolean verif = false;
        for (Character elemento : letraConsumo) {
            if (Objects.equals(elemento, letra)) {
                verif = true;
            }
        }
        if (verif) {
            this.consumoEnergetico = letra;
            System.out.println("La letra " + letra + " es correcta");
        } else {
            System.out.println("La letra " + letra + " es incorrecta se setea 'F' por defecto");
            consumoEnergetico = 'F';
        }

    }

//    • Método comprobarColor(String color): comprueba que el color es correcto, y si no lo es,
//usa el color blanco por defecto. Los colores disponibles para los electrodomésticos son
//blanco, negro, rojo, azul y gris. No importa si el nombre está en mayúsculas o en
//minúsculas. Este método se invocará al crear el objeto y no será visible.
    private void comprobarColor(String color) {
        boolean verif = false;
        for (Color aux : Color.values()) {
            String c = aux.getNombre();
            if (c.equalsIgnoreCase(color)) {
                verif = true;
            }
        }
        if (verif) {
            System.out.println("El color " + color + " es correcto");
            this.color = color;
        } else {
            System.out.println("El color " + color + " es incorrecta se setea ''blanco'' por defecto");
            this.color = "blanco";
        }

    }

    public Electrodomestico() {
    }

    public Electrodomestico(Double precio, String color, char consumoEnergetico, int peso) {
        this.precio = precio;
        this.peso = peso;
        comprobarColor(color);
        comprobarConsumoEnergetico(consumoEnergetico);
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(char consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Electrodomestico{" + "precio=" + precio + ", color=" + color + ", consumoEnergetico=" + consumoEnergetico + ", peso=" + peso + '}';
    }

}
