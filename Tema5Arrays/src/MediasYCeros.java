public class MediasYCeros {
    public static void main(String[] args) {
        int[] numeros ={42};
        int cuentaPositivos = 0;
        int sumaPositivos = 0;
        int cuentaNegativos = 0;
        int sumaNegativos = 0;
        int numeroCeros = 0;
        for (int valor :
                numeros) {
            if (valor > 0) {
                cuentaPositivos++;
                sumaPositivos+=valor;
            } else if (valor < 0) {
                cuentaNegativos++;
                sumaNegativos+=valor;
            } else {
                numeroCeros++;
            }
        }

        if(cuentaPositivos>0) {
            double mediaPositivos = (double) sumaPositivos / cuentaPositivos;
            System.out.println("La media de los positivos es:" + String.format("%.2f", mediaPositivos));
        } else {
            System.out.println("No hay positivos en el array");
        }
        if(cuentaNegativos>0) {
            double mediaNegativos = (double) sumaNegativos / cuentaNegativos;
            System.out.println("La media de los negativos es:" + String.format("%.2f", mediaNegativos));
        } else {
            System.out.println("No hay negativos en el array");

        }
        if(numeroCeros!=0) {
            System.out.println("Hay: " + numeroCeros + " cero(s)");
        } else {
            System.out.println("No hay ceros en el array");
        }
    }
}
