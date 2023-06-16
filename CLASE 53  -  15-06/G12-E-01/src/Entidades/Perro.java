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
public class Perro extends Animal  {

    public Perro(String nombre, String alimento, int edad, String razaAnimal) {
        super(nombre, alimento, edad, razaAnimal);
    }

    public Perro() {
        
    }

   

    
    
    @Override
    public void deQueSeAlimenta(){
        System.out.println("El perro se alimenta de "+super.alimento);
    }
    
}
