
package Bucles;

public class While {
    public static void main(String[] args) {
        int contador = 1; // Inicializamos la variable

        while (contador <= 5) { // Se ejecuta mientras la condición sea verdadera
            System.out.println("Iteración número: " + contador);
            contador++; // Incrementamos el contador en cada vuelta
        }

        System.out.println("Fin del bucle.");
    }
    }
}