/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Primer_programa;
import java.util.Scanner;

public class Ingresar_edad {
    public static void main(String[] args) {
        
        Scanner guardar = new Scanner(System.in);
        System.out.println("Ingresa tu edad: ");
        int edad = guardar.nextInt();
        System.out.println("Tu edad es: "+edad);        
    }
}
