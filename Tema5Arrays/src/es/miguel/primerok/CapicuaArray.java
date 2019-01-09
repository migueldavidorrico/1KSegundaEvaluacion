package es.miguel.primerok;

import java.util.Arrays;

public class CapicuaArray {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5,4,3,2,1};
        System.out.println(capicua2(a));
        devuelveCapicua(100);
    }
    public static int[] devuelveCapicua(int n){
        int salida[]=new int[n];
        int puntoInsercion=0;
        for (int i = 0; i < n / 2; i++) {
            salida[puntoInsercion++]=i;
        }
        if(n%2!=0){
            salida[puntoInsercion++]=42;
        }
        for (int i = 0; i < n / 2; i++) {
            salida[puntoInsercion++]=n/2-i-1;
        }
//        System.out.println(Arrays.toString(salida));
        return salida;
    }

    public static boolean capicua1(int[] a) {
        String temporal="";
        for (int valor :
                a) {
            temporal+=valor;
        }
//        System.out.println(temporal);
        String temporal2="";
        for (int i = a.length-1; i >=0; i--) {
            temporal2+=a[i];
        }
//        System.out.println(temporal2);
        return temporal.equals(temporal2);
    }
    public static boolean capicua2(int[] a){
        int principio=0;
        int ultimo=a.length-1;
        boolean escapicua=true;
        while(principio<=ultimo){
            if(a[principio]!=a[ultimo]){
                escapicua=false;
            }
            principio++;
            ultimo--;
        }
        return escapicua;
    }
}
