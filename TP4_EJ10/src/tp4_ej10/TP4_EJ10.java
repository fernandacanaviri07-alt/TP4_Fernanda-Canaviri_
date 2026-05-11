
package tp4_ej10;
import java.util.Random;


public class TP4_EJ10 {

    public static void main(String[] args) {
        
        int[] numeros = RellenarArray(1, 15, 10);
        for (int i = 0; i < 7; i++) {
            System.out.println(numeros[i]);
        }
    }

    static int[] RellenarArray(int desde, int hasta, int size) {
        int[] array = new int[size];
        Random Aleatorio = new Random();
        int numero_aleatorio;

        for (int contador = 0; contador < size; contador++) {
            do {
                numero_aleatorio = Aleatorio.nextInt(desde, hasta + 1);
            } while (ComprobarSiContiene(array, contador, numero_aleatorio));

            array[contador] = numero_aleatorio;
        }

        return array;
    }

    static boolean ComprobarSiContiene(int[] array, int pos_actual, int numero) {
        for (int i = 0; i < pos_actual; i++) {
            if (array[i] == numero) {
                return true;
            }
        }
        return false;
       
    }
    
}
