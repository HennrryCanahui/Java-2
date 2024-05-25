//scanner.nextLine
//scanner.nextInt

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("ingresa el numero a identificar:");
        int num = scanner.nextInt();
        EjerciciosJavaIf_elseHennrryCanahui identificacion = new EjerciciosJavaIf_elseHennrryCanahui();
        System.out.println(identificacion.identificadorNumero(num));

    //

        System.out.println("ingresa el numero a identificar:");
        int numeroParImpar = scanner.nextInt();
        EjerciciosJavaIf_elseHennrryCanahui numParImpar = new EjerciciosJavaIf_elseHennrryCanahui();
        System.out.println(numParImpar.identificadorNumero(numeroParImpar));

    //
        System.out.println("ingresa primer numero:");
        int primerNum = scanner.nextInt();
        System.out.println("ingresa segundo numero:");
        int segundoNum = scanner.nextInt();
        System.out.println("ingresa tercer numero:");
        int tercerNum = scanner.nextInt();
        EjerciciosJavaIf_elseHennrryCanahui comparadorNumeros = new EjerciciosJavaIf_elseHennrryCanahui();
        System.out.println(comparadorNumeros.numeroMayor(primerNum,segundoNum, tercerNum));

    //

        System.out.print("Ingresa un año: ");
        int año = scanner.nextInt();
        EjerciciosJavaIf_elseHennrryCanahui añoBisiesto = new EjerciciosJavaIf_elseHennrryCanahui();
        System.out.println(añoBisiesto.añoBisiesto(año));








    }
}