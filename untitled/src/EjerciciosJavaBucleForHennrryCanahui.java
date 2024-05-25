import java.util.Scanner;

public class EjerciciosJavaBucleForHennrryCanahui {


    public static void imprimirNumerosPares() {
        System.out.println("Números pares del 2 al 20:");
        for (int i = 2; i <= 20; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println(); // Salto de línea al final
    }

    public static void mostrarTablaMultiplicar(Scanner scanner) {
        System.out.print("Ingresa un número para mostrar su tabla de multiplicar (1 al 10): ");
        int numero = scanner.nextInt();

        System.out.println("Tabla de multiplicar de " + numero + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }

    public static void calcularSumaNumerosPares(Scanner scanner) {
        System.out.print("Ingresa un número entero positivo: ");
        int n = scanner.nextInt();

        int suma = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                suma += i;
            }
        }
        System.out.println("La suma de los números pares hasta " + n + " es: " + suma);
    }

    public static void calcularFactorial(Scanner scanner) {
        System.out.print("Ingresa un número para calcular su factorial: ");
        int num = scanner.nextInt();

        long factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        System.out.println("El factorial de " + num + " es: " + factorial);
    }
}

