import java.util.Scanner;

public class EjerciciosJavaBucleWhileHennrryCanahui {
    public String nombre;
    public EjerciciosJavaBucleWhileHennrryCanahui(){

    }

    public static void imprimirNumerosAscendentes() {
        int numero = 1;
        while (numero <= 20) {
            System.out.print(numero + " ");
            numero++;
        }
    }

    public boolean ListaNum(int a) {
        int inicio = 1;
        while (inicio <= a) {
            System.out.println(inicio);
            inicio++;
        }
        return false;
    }

    public static void sumarNumerosPositivos(Scanner nums) {
        int suma = 0;
        int numero;

        System.out.println("Ingresa números positivos (ingresa un número negativo para detener):");
        while (true) {
            numero = nums.nextInt();
            if (numero < 0) {
                break;
            }
            suma += numero;
        }

        System.out.println("La suma de los números positivos es: " + suma);
    }

    public static void generarSecuenciaFibonacci(int limite) {
        int a = 0, b = 1;
        System.out.print("Secuencia de Fibonacci hasta " + limite + ": ");
        while (a <= limite) {
            System.out.print(a + " ");
            int siguiente = a + b;
            a = b;
            b = siguiente;
        }
    }







}



