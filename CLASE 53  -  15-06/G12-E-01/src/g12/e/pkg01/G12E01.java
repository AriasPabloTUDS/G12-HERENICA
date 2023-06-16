/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g12.e.pkg01;

import Entidades.Animal;
import Entidades.Caballo;
import Entidades.Gato;
import Entidades.Perro;
import java.util.ArrayList;

/**
 *
 * @author Pablo
 */
public class G12E01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //String nombre, String alimento, int edad, String razaAnimal)
        ArrayList<Animal> animales = new ArrayList<>();
        
        Animal perro1 = new Perro("Pibu","Balanceado",1,"Pitbull");
        Animal gato1 = new Gato("Mishifus","Balanceado",2,"Naranjoso");
        Animal caballo1 = new Caballo("Manso","Fardo",5,"Alazan");
        
        animales.add(perro1);
        animales.add(gato1);
        animales.add(caballo1);
        
      
        
        
        for (Animal animal : animales) {
            animal.deQueSeAlimenta();
        }
        
    }
    
}
