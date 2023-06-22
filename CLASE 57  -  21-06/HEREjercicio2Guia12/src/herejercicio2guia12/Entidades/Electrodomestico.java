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
• Método comprobarColor(String color): comprueba que el color es correcto, y si no lo es,
usa el color blanco por defecto. Los colores disponibles para los electrodomésticos son
blanco, negro, rojo, azul y gris. No importa si el nombre está en mayúsculas o en
minúsculas. Este método se invocará al crear el objeto y no será visible.
Metodo crearElectrodomestico(): le pide la información al usuario y llena el
electrodoméstico, también llama los métodos para comprobar el color y el consumo. Al
precio se le da un valor base de $1000.
• Método precioFinal(): según el consumo energético y su tamaño, aumentará el valor del
precio. Esta es la lista de precios:
 */
package herejercicio2guia12.Entidades;

import herejercicio2guia12.Entidades.Enumeracion.Color;
import java.util.Scanner;

public  class Electrodomestico {

    protected Double precio;
    protected String color;
    protected char consumoE;
    protected Double peso;

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Electrodomestico() {
    }

    public Electrodomestico(Double precio, String color, char consumoE, Double peso) {
        this.precio = precio;
        this.color = color;
        this.consumoE = consumoE;
        this.peso = peso;
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

    public char getConsumoE() {
        return consumoE;
    }

    public void setConsumoE(char consumoE) {
        this.consumoE = consumoE;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public char comprobarConsumoEnergetico(char letra) {

        if (letra >= 'A' && letra <= 'F') {
            return letra;
        } else {
            return 'F';
        }
    }

    public String comprobarColor(String color) {
        for (Color aux : Color.values()) {
            if (aux.toString().equalsIgnoreCase(color)) {
                return color;
            } else {
                return "Blanco";
            }
        }
        return null;
    }

    public void crearElectrodomestico() {
        System.out.println("Ingrese el color de su electrodomestico");
        this.color = comprobarColor(leer.next());
        System.out.println("Ingrese el peso del electrodomestico");
        this.peso = leer.nextDouble();
        System.out.println("Ingrese la letra de consumo energetico");
        this.consumoE = comprobarConsumoEnergetico(leer.next().charAt(0));
        this.precio = 1000.00;
    }

    public void precioFinal() {
        switch (this.consumoE) {
            case 'A':
                this.precio = this.precio + 1000.00;
            case 'B':
                this.precio = this.precio + 800.00;
            case 'C':
                this.precio = this.precio + 600.00;
            case 'D':
                this.precio = this.precio + 500.00;
            case 'E':
                this.precio = this.precio + 300.00;
            case 'F':
                this.precio = this.precio + 100.00;
        }

        if (this.peso >= 1 && this.peso <= 19) {
            this.precio = this.precio + 100.00;
        } else if (this.peso >= 20 && this.peso <= 49) {
            this.precio = this.precio + 500.00;
        } else if (this.peso >= 50 && this.peso <= 79) {
            this.precio = this.precio + 800.00;
        }else{
             this.precio = this.precio +1000.00;
        }
        
    }

   public void mostrarElectrodomestico(){
       System.out.println("Electrodomestico{" + "precio=" + this.precio + ", color=" + this.color + ", consumoE=" + this.consumoE + ", peso=" + this.peso );
   }

   

       
    
}

