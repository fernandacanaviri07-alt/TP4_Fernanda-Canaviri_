
package tp4_ej8;
import java.util.Scanner; 

public class TP4_EJ8 {
    
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        String[] nombres = new String[20];
        double[] sueldos = new double[20];
        double mayorSueldo = 0;
        String nombreMayor = null;

        for (int num1 = 0; num1 < 20; num1++) {
            System.out.print("Ingrese el nombre del empleado: ");
            nombres[num1] = lector.next();
            System.out.print("Ingrese el sueldo: ");
            sueldos[num1] = lector.nextDouble();

            if (num1 == 0) {
                mayorSueldo = sueldos[num1];
                nombreMayor = nombres[num1];
            } else {
                if (sueldos[num1] > mayorSueldo) {
                    mayorSueldo = sueldos[num1];
                    nombreMayor = nombres[num1];
                }
            }
        }
        System.out.println("Empleado con mayor sueldo:");
        System.out.println("Nombre: " + nombreMayor);
        System.out.println("Sueldo: " + mayorSueldo);
    }
    
}
