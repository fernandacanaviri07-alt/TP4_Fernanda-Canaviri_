
package tp4_ej9;

import java.util.Random;

public class TP4_EJ9 {

    
    public static void main(String[] args) {
        int desde = 1;
        int hasta = 20;
        int tamanio = 10;
        int[] vector9 = llenarArray(desde, hasta, tamanio);

        System.out.println("Contenido del array:");
        for (int num1 = 0; num1 < vector9.length; num1++) {

            System.out.println(vector9[num1]);
        }
    }
    public static int[] llenarArray(int desde, int hasta, int tamanio) {

        Random random = new Random();
        int[] vector9 = new int[tamanio];

        for (int num1 = 0; num1 < tamanio; num1++) {
            int numero;
            do {
                numero = random.nextInt(hasta - desde + 1) + desde;
            } while (comprobarSiContiene(vector9, num1, numero));
            vector9[num1] = numero;
        }
        return vector9;
    }
    public static boolean comprobarSiContiene(int[] vector9, int posicion, int numero) {
        for (int num1 = 0; num1 < posicion; num1++) {
            if (vector9[num1] == numero) {
                return true;
            }
        }
        return false;
    }
    
}
