/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades.Servicios;

import Entidades.Electrodomestico;
import Entidades.Enum.Color;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

/**
 *
 * @author Pablo
 */
public class ElectrodomesticoServicio {
    
    Scanner leer = new Scanner(System.in);
    Electrodomestico elec1;
    
    public Electrodomestico crearElectrodomestico(){
        System.out.println("Elija el Electro a crear");
        
        System.out.println("Crear electrodoméstico");
        System.out.println("Ingrese el precio: ");
        double precio = leer.nextDouble();
        System.out.println("Ingrese el color: ");
        String color = leer.next();
        System.out.println("Ingrese el consumo energético: ");
        char cEnerg = leer.next().charAt(0);
        System.out.println("Ingrese el peso: ");
        int peso = leer.nextInt();
        return elec1 = new Electrodomestico() {
};
        
    }
    
    //    • Método comprobarConsumoEnergetico(char letra): comprueba que la letra es correcta,
//sino es correcta usara la letra F por defecto. Este método se debe invocar al crear el
//objeto y no será visible.
   /* private void comprobarConsumoEnergetico(Character letra) {
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

    }*/
    
    //    • Método comprobarColor(String color): comprueba que el color es correcto, y si no lo es,
//usa el color blanco por defecto. Los colores disponibles para los electrodomésticos son
//blanco, negro, rojo, azul y gris. No importa si el nombre está en mayúsculas o en
//minúsculas. Este método se invocará al crear el objeto y no será visible.
   /* private void comprobarColor(String color) {
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

    }*/
    
    public void menu() {
        System.out.println("");
        System.out.println("----- MENU -----");
        System.out.println("Seleccione una opción: ");
        System.out.println("1. Crear electrodoméstico");
        System.out.println("2. Ver siguiente carta");
        System.out.println("3. Pedir cartas");
        System.out.println("4. Ver cartas ya usadas");
        System.out.println("5. Ver cartas aún en el mazo");
        System.out.println("6. Salir del programa");
        System.out.println("");
        String opc = leer.next();
        switch (opc) {
            case "1":
                crearElectrodomestico();
                System.out.println("Electrodoméstico creado");
                menu();
                break;
            case "2":
                
                
                menu();
                break;
            case "4":
                ;
                menu();
                break;
            case "5":
                
                menu();
                break;
            case "6":
                System.out.println("Ejecución finalizada");
                break;
            default:
                System.out.println("Opcion no válida");
                ;
                menu();
        }

    }
    
}
