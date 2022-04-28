package Academy;

import java.util.Scanner;

public class b1e3 {
    public static void main (String arg []) {


        System.out.println("Te voy a pedir 2 numeros enteros");

        System.out.println("Escribe el primero");
        Scanner scanner = new Scanner(System.in);
        float primero = scanner.nextInt();

        System.out.println("Escribe el segundo");
        float segundo = scanner.nextInt();
        scanner.close();

        float suma = primero + segundo;
        float resta = primero - segundo;
        double division = primero/segundo;
        float multiplicacion = primero * segundo;

        System.out.println(" La suma de ambos es: " + suma);
        System.out.println(" La resta de ambos es: " + resta);
        System.out.println(" La division de ambos es: " + division);
        System.out.println(" La multiplicacion de ambos es: " + multiplicacion);
    }
}
