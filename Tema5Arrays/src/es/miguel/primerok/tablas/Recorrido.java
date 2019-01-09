package es.miguel.primerok.tablas;

public class Recorrido {
    public static void main(String[] args) {
        int[][] tabla=
                {
                        {1,2,3},
                        {8,7,0,2,4},
                        {0},
                        {0},
                        {1,1,1,1,1}
                };
        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[i].length; j++) {
                System.out.printf("%2s ",tabla[i][j]);
            }
            System.out.println("");
        }
        System.out.println("-------------------------------");

        for (int[] fila :tabla) {
            for (int valor :fila) {
                System.out.printf("%2s ",valor);
            }
            System.out.println("");
        }
    }
}
