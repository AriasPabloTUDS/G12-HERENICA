/*
 Vamos a crear una Lavadora y un Televisor y llamar a los métodos necesarios para mostrar
el precio final de los dos electrodomésticos.
 */
package herejercicio2guia12;

import herejercicio2guia12.Entidades.Electrodomestico;
import herejercicio2guia12.Entidades.Lavadora;

public class HEREjercicio2Guia12 {

    public static void main(String[] args) {
        Lavadora L = new Lavadora();

        L.crearLavadora();
        L.precioFinal();
       L.mostrarElectrodomestico();
    }

}
