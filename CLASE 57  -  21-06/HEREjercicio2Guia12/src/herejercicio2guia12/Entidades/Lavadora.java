/*
 A continuación, se debe crear una subclase llamada Lavadora, con el atributo carga,
además de los atributos heredados.
Los constructores que se implementarán serán:
• Un constructor vacío.
• Un constructor con la carga y el resto de los atributos heredados. Recuerda que debes
llamar al constructor de la clase padre.
Los métodos que se implementara serán:
• Método get y set del atributo carga.
• Método crearLavadora (): este método llama a crearElectrodomestico() de la clase
padre, lo utilizamos para llenar los atributos heredados del padre y después llenamos
el atributo propio de la lavadora.
• Método precioFinal(): este método será heredado y se le sumará la siguiente
funcionalidad. Si tiene una carga mayor de 30 kg, aumentará el precio en $500, si la
carga es menor o igual, no se incrementará el precio. Este método debe llamar al
método padre y añadir el código necesario. Recuerda que las condiciones que hemos
visto en la clase Electrodoméstico también deben afectar al precio.
 */
package herejercicio2guia12.Entidades;

public class Lavadora extends Electrodomestico {

    protected int carga;
    

    public Lavadora() {
   // this.L = new Electrodomestico();
         
    }

  

    public Lavadora(int carga, Double precio, String color, char consumoE, Double peso) {
        super(precio, color, consumoE, peso);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    public void crearLavadora() {
        super.crearElectrodomestico();
        System.out.println("Ingrese la carga de la lavadora");
        int num = leer.nextInt();
        Lavadora L = new Lavadora(num, precio, color, consumoE, peso);
    }

    @Override
    public void precioFinal() {
        if(carga>=30){
            L.setPrecio(L.getPrecio()+500.00); 
        }
       // System.out.println("el precio final del producto es "+L.getPrecio());
        }

    @Override
    public void mostrarElectrodomestico(){
       System.out.println("Lavadora{" + "carga=" + this.carga + ", preciofinal=" + this.precio + ", color=" + this.color + ", consumoE=" + this.consumoE + ", peso=" + this.peso );
    }
    
    
}
