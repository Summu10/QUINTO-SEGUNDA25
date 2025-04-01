
package POO;

public class MainEstudiante {
    public static void main(String[] args) {
        Estudiante estudiante1= new Estudiante("Luciana", 17, 9, 1.55, "Castaño");
        Estudiante estudiante2= new Estudiante("Tisiano", 17, 12, 1.61, "Negro");
        
        estudiante2.horaLibre();
        estudiante1.horaLibre();
        
        estudiante1.rendir();
        estudiante1.estudiar();
    }
}
