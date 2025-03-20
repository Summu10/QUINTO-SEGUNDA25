
package Condiciones;
import java.util.Scanner;
/**
 * < > [ ]
 * @author LABO_B11
 */
public class CondiciónSwitchAlternativo {
    public static void main(String[] args) {
        // String sim = entrada.nextLine();
        Scanner leer = new Scanner(System.in);
        
        int n1 = 5, n2 = 10;
        
        switch (sim) {
            case ("+"):
                System.out.println("Seleccionaste la opción 1. Suma = "+(n1+n2) );
                break;
            case ("-"):
                System.out.println("Seleccionaste la opción 1. Resta = "+(n1-n2));
                break;
            case ("*"):
                System.out.println("Seleccionaste la opción 1. Producto = "+(n1*n2));
                break;
            case ("/"):
                System.out.println("Seleccionaste la opción 1. División = "+(n1/n2));
                break;
            default:
                System.out.println("Opción no válida.");
        }

        System.out.println("Fin del programa.");
    }
        
        
    }
}