
package Condiciones;

/**
 * < > [ ]
 * @author LABO_B11
 */
public class CondicionalMultinivel {
    //psvm + tab
    public static void main(String[] args) {
        //sout + tab
        //IF - SI
        int n1 = 18, n2 = 20, n3 = 3;
        if (n1 > n2 && n1 > n3){
            System.out.println("El numero mayor es: "+n1);
        } else if(n2 > n1 && n2 > n3){
            System.out.println("El numero mayor es: "+n2);
        } else {
            System.out.println("El numero mayor es: "+n3);
        }
    }
    
}