
package tp4_ej9_fer;
import java.util.Scanner;

public class TP4_EJ9_FER {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lector = new Scanner(System.in);

        int pagosRealizados = 0;
        int total = 10;


        for (int i = 1; i <= total; i++) {
            System.out.print("Alumno " + i + " pago: ");
    
            if (lector.nextBoolean()) {
            pagosRealizados++;
            }
        }

        int deudores = total - pagosRealizados;
        double porcentaje = pagosRealizados * 100.0 / total;

        System.out.println("Pagos: " + pagosRealizados);
        System.out.println("Deudores: " + deudores);
        System.out.println("Porcentaje: " + porcentaje);

        lector.close();
    }
    
}
