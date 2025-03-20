
package Bucles;

public class For {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) { // Inicialización; condición; incremento
            System.out.println("Iteración número: " + i);
        }

        System.out.println("Fin del bucle.");
    }
    /**Nota!! 
     * for (int i = 1; i <= 5; i++) controla el bucle en una sola línea:
     * int i = 1; → Inicializa i en 1.
     * i <= 5; → Se ejecuta mientras i sea menor o igual a 5.
     * i++ → Incrementa i en cada iteración.
     * Una vez que i = 6, la condición es falsa y el bucle se detiene.
     */
}