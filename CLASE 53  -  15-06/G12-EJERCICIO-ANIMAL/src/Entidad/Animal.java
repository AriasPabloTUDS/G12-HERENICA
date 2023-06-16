/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;


/**
 *
 * @author Pablo
 */
public class Animal implements Interfaz{

    public Animal() {
    }
    
    public String hacerRuido(){
        return "Hola ";
    }
     public String hacerRuido(String ruido){
        return "Hola "+Interfaz.RUIDO;
    }
    
    @Override
    public void gritar(){
        System.out.println("ahhhhhh!");
    }
    
}
