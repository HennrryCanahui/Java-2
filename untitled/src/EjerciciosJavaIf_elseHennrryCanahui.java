public class EjerciciosJavaIf_elseHennrryCanahui {

    private  String nombre;
    public EjerciciosJavaIf_elseHennrryCanahui(){

    }

    public String identificadorNumero(int a) {
        String Respuesta;
        if (a > 0) {
            Respuesta = a + " Es positivo";
        } else if (a < 0) {
            Respuesta = a + " Es negativo";
        } else {
            Respuesta = "El número es '0'";
        }
        return Respuesta;
    }

    public String parImpar(int a) {
        String Respuesta;
        if (a % 2 == 0) {
            Respuesta = a + " es par";
        } else {
            Respuesta = a + " es impar";
        }
        return Respuesta;
    }

    public int numeroMayor (int a , int b, int c){
        int mayor = a;
        if (b > mayor) {
            mayor = b;
        } else if (c > mayor) {
            mayor = c;
        }
        return mayor;
    }

    public String añoBisiesto(int a) {
        int año = a;
        boolean esBisiesto = (año % 4 == 0 && año % 100 != 0) || (año % 400 == 0);
        if (esBisiesto) {
            return "El año " + año + " es bisiesto.";
        } else {
            return "El año " + año + " no es bisiesto.";
        }
    }
}
