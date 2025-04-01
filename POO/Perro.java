
package POO;

public class Perro {

    //ATRIBUTOS:
    String nombre, raza;
    
    //CONSTRUCTOR:
    public Perro(String nombre, String raza) {
        this.nombre = nombre;
        this.raza = raza;
    }

    //METODOS
    void Ladrar() {
        System.out.println(nombre + ": Guau! guau!");
    }
    
    public static void main(String[] args) {
        Perro perro1= new Perro("Pedro", "Caniche");
        Perro perro2 = new Perro("Max", "Pastor Aleman");
        
        perro1.Ladrar();
        perro2.Ladrar();
    }
}


