package es.miguel.primerok.arrays;

import java.util.Arrays;

public class EjerciciosArrays {
    public static void main(String[] args) {
        int[] a={3,3,4,2};
        int[] b={-2,-4};
        int[] c={0,0,0,0,01,1,0,0,10,01,01,01};
        int[] ab=concatenar(a,b);
        System.out.println(Arrays.toString(ab));
        int[] cap={1,2,1,0};
        System.out.println(esCapicua(cap));
        int[] propA={6,6,8,4};
        System.out.println(propicional( propA,a));

    }

    private static boolean propicional(int[] a, int[] propA) {
        double factor=a[0]/(double)propA[0];
        for (int i = 0; i < a.length; i++) {
            if(propA[i]*factor!=a[i]){
                return false;
            }
        }
        return true;
    }

    private static boolean esCapicua(int[] cap) {
        int[] alReves=new int[cap.length];
        for (int i = 0; i < cap.length; i++) {
            alReves[i]=cap[cap.length-i-1];
        }

        return Arrays.equals(alReves,cap);
    }

    public static int[] concatenar(int[] u,int[] v){
        int[] salida;
        salida=new int[u.length+v.length];
        int indiceInsertar=0;
        for (int i :
                u) {
            salida[indiceInsertar++]=i;
        }
        for (int i :
                v) {
            salida[indiceInsertar++]=i;
        }

        return salida;
    }
}
