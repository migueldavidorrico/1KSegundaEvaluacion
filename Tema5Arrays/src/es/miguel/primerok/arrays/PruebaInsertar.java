package es.miguel.primerok.arrays;

import java.util.Arrays;

public class PruebaInsertar {
    public static void main(String[] args) {
        int[] v={7,8,5,4,3};
        int[] resultado=insertar(v,10203);
        int[] resultado2=insertarPosicion(v,1000,2);
        System.out.println(Arrays.toString(resultado));
        System.out.println(Arrays.toString(resultado2));
        //[7,8,0,5,4]
    }

    private static int[] insertarPosicion(int[] v, int valor, int posicion) {

        int[] salida=new int[v.length];
        //Al principio quiero que salida sea igual que v
        for (int i = 0; i < v.length; i++) {
            salida[i]=v[i];
        }
//        v[4]=v[3];
//        v[3]=v[2];
//        v[2]=v[1];
//        v[1]=v[0];
        for (int i = v.length-2; i >= posicion; i--) {
            System.out.println(v[i+1]+" cambia por "+v[i]);
            salida[i+1]=v[i];
        }
        salida[posicion]=valor;
        return salida;
    }

    private static int[] insertar(int[] v, int valor) {
        int[] salida=new int[v.length];
//        v[4]=v[3];
//        v[3]=v[2];
//        v[2]=v[1];
//        v[1]=v[0];
        for (int i = v.length-2; i >= 0; i--) {
            System.out.println(v[i+1]+" cambia por "+v[i]);
            salida[i+1]=v[i];
        }
        salida[0]=valor;
        return salida;
    }
}
