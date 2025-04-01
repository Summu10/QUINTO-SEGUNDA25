
package POO;

import javax.swing.JOptionPane;

public class Estudiante {

    //Atributos:
    String nombre;
    int edad;
    double nivel, alt;
    String colorP;
    
       //Constructor
    public Estudiante(String nombre, int edad, double nivel, double alt, String colorP) {
        this.nombre = nombre;
        this.edad = edad;
        this.nivel = nivel;
        this.alt = alt;
        this.colorP = colorP;
    }  
    
        //Metodos -- Accion del objeto
        void estudiar(){
        System.out.println(nombre +"Esta estudiando..");
}
        void rendir(){
            System.out.println(nombre +" Esta rindiendo..");
        }
        
        void horaLibre(){
            JOptionPane.showMessageDialog(null, nombre + " Esta en hora libre..");
        }
}
