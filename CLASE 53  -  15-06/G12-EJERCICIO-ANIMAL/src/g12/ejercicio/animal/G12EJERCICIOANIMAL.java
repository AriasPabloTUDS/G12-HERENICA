/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g12.ejercicio.animal;

import Entidad.Animal;
import Entidad.Gato;
import Entidad.Perro;
import java.util.ArrayList;

/**
 *
 * @author Pablo
 */
public class G12EJERCICIOANIMAL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Animal> animales = new ArrayList<>();
        
        
        Animal a = new Animal();
        Animal b = new Perro();
        Animal c = new Gato();
        
        animales.add(a);
        animales.add(b);
        animales.add(c);
        
        for (Animal animal : animales) {
            System.out.println(animal.hacerRuido());
        }
        
        a.gritar();
        System.out.println(a.hacerRuido("GRRR!"));
    }
    
}
