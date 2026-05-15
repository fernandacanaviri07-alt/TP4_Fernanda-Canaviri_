
package tp4_ej4_fer;
import java.util.Scanner;

public class TP4_EJ4_FER {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lector = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de alumnos: ");
        int n = lector.nextInt();

        double[] notas = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese la nota del alumno " + (i + 1) + ": ");
            notas[i] = lector.nextDouble();
        }
        double suma = 0;
        for (int i = 0; i < n; i++) {
            suma += notas[i];
        }
        double media = suma / n;
        System.out.println("Nota media del grupo: " + media);

        System.out.println("Alumnos con nota superior a la media:");
        for (int i = 0; i < n; i++) {
            if (notas[i] > media) {
                System.out.println("Alumno " + (i + 1) + " con nota: " + notas[i]);
            }

        
        }
    }
    
}
