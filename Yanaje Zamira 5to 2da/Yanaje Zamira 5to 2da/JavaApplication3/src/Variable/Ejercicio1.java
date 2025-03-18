
package Variable;
import java.util.Scanner;

public class Ejercicio1 {
    //MAIN:
    public static void main(String[] args) {
        String nombre, comida;
        Scanner leer = new Scanner (System.in);
        
        
        System.out.print("¿Tu nombre es..?");
        nombre = leer.next();
        
        System.out.print("¿Tu comida favorita es..?");
        comida = leer.next();
        
        System.out.println("Tu nombre es.. "+nombre);
        System.out.println("Tu comida favorita es.."+comida);       
        
    }
}
