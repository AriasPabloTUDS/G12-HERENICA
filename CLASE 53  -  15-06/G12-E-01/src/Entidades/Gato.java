/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author Pablo
 */
public class Gato extends Animal  {

    public Gato(String nombre, String alimento, int edad, String razaAnimal) {
        super(nombre, alimento, edad, razaAnimal);
    }

    public Gato() {
    }
    
    
    
    
     @Override
    public void deQueSeAlimenta(){
        System.out.println("El gato se alimenta de "+super.alimento);
    }
    
}
