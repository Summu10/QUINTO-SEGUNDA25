
package Condiciones;
import java.util.Scanner;

/**
 * < > [ ]
 * @author LABO_B11
 */
public class CondicionSwitch {
    public static void main(String[] args) {
        int n1, n2, opcion;
        Scanner leer = new Scanner (System.in);
        
        System.out.println("Ingrese un numero: ");
        n1 = leer.nextInt();
        
        System.out.println("Ingrese otro numero: ");
        n2 = leer.nextInt();
        
        System.out.println("Elige una opcion: 1 - 4");
        opcion = leer.nextInt();
        
        switch (opcion) {
            case 1:
                System.out.println("Seleccionaste la opción 1.");
                System.out.print( "Suma = "+(n1 + n2));
                break;
            case 2:
                System.out.println("Seleccionaste la opción 2.");
                System.out.println( "Resta = "+(n1 - n2));
                break;
            case 3:
                System.out.println("Seleccionaste la opción 3.");
                System.out.println( "Multiplicación = "+(n1 * n2));
                break;
            case 4:
                System.out.println("Seleccionaste la opción 4.");
                System.out.println( "Division = "+(n1 / n2));
                break;
            default:
                System.out.println("Opción no válida.");
        }

        System.out.println("Fin del programa.");
    }
}