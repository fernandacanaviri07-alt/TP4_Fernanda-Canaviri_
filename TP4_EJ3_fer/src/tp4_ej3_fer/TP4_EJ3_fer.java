
package tp4_ej3_fer;
import java.util.Scanner;

public class TP4_EJ3_fer {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int[] numeros = new int[10];

        int suma = 0;
        int contador = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Numero entero: ");
            numeros[i] = lector.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) { 
                suma += numeros[i];
                contador++;
            }
        }
        double promedio = (double) suma / contador;
        System.out.println("Promedio de posiciones pares: " + promedio);
    }

    }
    
}
