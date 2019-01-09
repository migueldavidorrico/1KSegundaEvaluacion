package es.miguel.primerok.arrays;

import java.util.Arrays;

public class PositivosPrimero {
    public static void main(String[] args) {

        int[] v={-10,50,60,-1,5,6,-3};
        int[] solucion=positivosPrimero(v);
        System.out.println(Arrays.toString(solucion));
        //[5,6,5,6,-10,-1,-3]
        int[] solucion2=positivosPrimero2(v);
        System.out.println(Arrays.toString(solucion2));


    }

    private static int[] positivosPrimero2(int[] v) {
        int[] salida=new int[v.length];
        int insercionPositivos=0;
        int insercionNegativos=v.length-1;
        int indice=0;
        while(insercionPositivos<=insercionNegativos){
            int actual=v[indice++];
            if(actual>=0){
                salida[insercionPositivos++]=actual;
            } else {
                salida[insercionNegativos--]=actual;

            }
        }
        return salida;
    }


    private static int[] positivosPrimero(int[] v) {
        int[] salida=new int[v.length];
        System.out.println(Arrays.toString(v)+"--> el que me pasan");
        System.out.println(Arrays.toString(salida)+"--> el mio");

        int positivosMetidos=0;

        //el primero lo pongo

        salida[0]=v[0];
        if(v[0]>=0){
            positivosMetidos++;
        }
        System.out.println(Arrays.toString(salida)+"--> el mio");
        //Voy cogiendo los numeros
        for (int i = 1; i < v.length; i++) {
            //System.out.println(v[i]+"--> el que voy mirando");
            //si es positivo --> al principio
            int actual=v[i];
            if(v[i]>=0){
                System.out.println(actual + " Positivo --> al principio");
                salida=insertar(salida,actual);
                positivosMetidos++;
                System.out.println(Arrays.toString(salida)+"--> el mio");

            }
            //si es negativo --> después de los positivos
            else {
                System.out.println(v[i] + " Negativo --> después de los positivos y en la posición "+positivosMetidos);
                salida=insertarPosicion(salida,actual,positivosMetidos);
                System.out.println(Arrays.toString(salida)+"--> el mio");

            }

        }
        return salida;
    }
    private static int[] insertar(int[] v, int valor) {
        int[] salida=new int[v.length];
//        v[4]=v[3];
//        v[3]=v[2];
//        v[2]=v[1];
//        v[1]=v[0];
        for (int i = v.length-2; i >= 0; i--) {
           // System.out.println(v[i+1]+" cambia por "+v[i]);
            salida[i+1]=v[i];
        }
        salida[0]=valor;
        return salida;
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
           // System.out.println(v[i+1]+" cambia por "+v[i]);
            salida[i+1]=v[i];
        }
        salida[posicion]=valor;
        return salida;
    }

}
