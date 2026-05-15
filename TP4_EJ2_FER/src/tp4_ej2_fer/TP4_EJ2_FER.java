
package tp4_ej2_fer;
import java.util.Scanner;

public class TP4_EJ2_FER {
  
    public static void main(String[] args) {
    { int[] numeros = new int[10]; 
    Scanner lector= new Scanner(System.in); int sumaPositivos = 0; 
    int sumaNegativos = 0; 
    int contadorPositivos = 0; 
    int contadorNegativos = 0; 
    
    for (int i = 0; i < 10; i++) { 
    System.out.print("Ingrese un numero: "); numeros[i] = lector.nextInt(); 
    if (numeros[i] > 0) {
    sumaPositivos += numeros[i]; 
    contadorPositivos++; 
    }    
    else if (numeros[i] < 0) { 
    sumaNegativos += numeros[i]; 
    contadorNegativos++; 
    } 
    } 
    double promedioPositivos = 0; 
    
    double promedioNegativos = 0; 
    
    if (contadorPositivos > 0) { 
    promedioPositivos = (double) sumaPositivos / contadorPositivos; } 
    
    if (contadorNegativos > 0) { 
    promedioNegativos = (double) sumaNegativos / contadorNegativos; } 
    
    System.out.println("Promedio positivos: " + promedioPositivos); System.out.println("Promedio negativos: " + promedioNegativos); } 
    } 
     
        
}
