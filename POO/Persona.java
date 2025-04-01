
package POO;

import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Persona {
    //ATRIBUTOS:
    String nombre, apellido, hobby;
    int edad; 
    
    //CONSTRUCTOR:    
    public Persona(String nombre, String apellido, String hobby, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.hobby = hobby;
        this.edad = edad;
    }
    
    //METODOS:
    void programando(){
        JOptionPane.showMessageDialog(null, nombre + " esta programando!");
    }
    
    void dibujando(){
        JOptionPane.showMessageDialog(null, nombre + " esta dibujando!");
    }
    
    //MAIN
    public static void main(String[] args) {
        Persona persona1 = new Persona("Evan", "Martinez", "Programar", 19);
        Persona persona2 = new Persona("Sarah", "Abigail", "Dibujante", 12);
        
        persona1.programando();
        persona2.dibujando();
        
        
    }
}
