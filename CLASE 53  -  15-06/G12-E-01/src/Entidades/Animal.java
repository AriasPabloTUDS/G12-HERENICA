/*
La clase Animal tendrá como atributos el nombre, alimento, edad y raza del Animal.

Crear un método en la clase Animal a través del cual cada clase hija deberá mostrar luego un
mensaje por pantalla informando de que se alimenta. Generar una clase Main que realice lo
siguiente:
 */
package Entidades;

/**
 *
 * @author Pablo
 */
public class Animal {
    protected String nombre;
    protected String alimento;
    protected int edad;
    protected String razaAnimal;

    public Animal(String nombre, String alimento, int edad, String razaAnimal) {
        this.nombre = nombre;
        this.alimento = alimento;
        this.edad = edad;
        this.razaAnimal = razaAnimal;
    }

    public Animal() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getRazaAnimal() {
        return razaAnimal;
    }

    public void setRazaAnimal(String razaAnimal) {
        this.razaAnimal = razaAnimal;
    }
    
    public void deQueSeAlimenta(){
        System.out.println("Animal se alimenta de "+alimento);
    }

    @Override
    public String toString() {
        return "Animal{" + "nombre=" + nombre + ", alimento=" + alimento + ", edad=" + edad + ", razaAnimal=" + razaAnimal + '}';
    }
    
    
}
