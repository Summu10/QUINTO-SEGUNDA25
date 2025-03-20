
package Variables;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        String nombre;
        int edad;
        Scanner leer = new Scanner(System.in);
        
        System.out.print("Ingresa tu nombre: ");
        nombre = leer.next();
        
        System.out.print("Ingresa tu edad: ");
        edad = leer.nextInt();
        
        System.out.println("Tu nombre es.. "+nombre);
        System.out.println("Tu edad es.. "+edad);
        
    }
}
