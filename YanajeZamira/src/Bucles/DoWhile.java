
package Bucles;

public class DoWhile {
    public static void main(String[] args) {
        int contador = 1; // Inicializamos la variable

        do {
            System.out.println("Iteración número: " + contador);
            contador++; // Incrementamos el contador
        } while (contador <= 5); // Verificamos la condición después de ejecutar el código

        System.out.println("Fin del bucle.");
    }
    /**Nota!!!
     * El bloque dentro de do { ... } se ejecuta al menos una vez, sin importar la condición.
     * Luego, while (contador <= 5) verifica si el bucle debe continuar.
     * Si contador = 6, la condición es falsa y el bucle termina.
     */
    }