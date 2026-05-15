
package tp4_ej1_fer;
import java.util.Scanner;

public class TP4_EJ1_Fer {

    public static void main(String[] args) {
        
        Scanner lector = new Scanner(System.in);
        int[] numeros = new int[7];

        int i = 0;
        while (i < 7) {
            System.out.print("numero: ");
            numeros[i] = lector.nextInt();
            i++;
        }

        System.out.println("Numeros ingresados:");
        for (int a = 0; a < 7; a++) {
            System.out.println(numeros[a]);
        }

    }
    
}
