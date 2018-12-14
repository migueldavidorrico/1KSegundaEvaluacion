import javafx.geometry.Pos;

import javax.swing.*;
import java.lang.reflect.Array;
import java.util.Arrays;

public class PosicionesMaximo {
    public static void main(String[] args) {
        int[] a={1,1,1,1,2,2,2,1,1,3,3,3,1,1,1};
        System.out.println("El máximo del array es " + PosicionesMaximo.maximo(a));
        System.out.println(Arrays.toString(a));
        System.out.println("la 1ª posición del máximo es: " + PosicionesMaximo.primeraPosicionMaximo(a));
        System.out.println("Las posiciones del máximo son:" + Arrays.toString(posicionesMaximo(a)));
    }
    public static int[] posicionesMaximo(int[] lista){
        int[] posiciones=new int[lista.length];
        int maximosEncontrados=0;
        int maximo=lista[0];
        for (int i = 0; i < lista.length; i++) {
            if(lista[i]==maximo){
                posiciones[maximosEncontrados++]=i;
            } else if(lista[i]>maximo){
                maximo=lista[i];
                maximosEncontrados=1;
                posiciones[0]=i;
            }
            JOptionPane.showMessageDialog(null,Arrays.toString(posiciones));
        }
        posiciones= Arrays.copyOf(posiciones,maximosEncontrados);
        return posiciones;
    }


    public static int primeraPosicionMaximo(int[] loQueUstedQuiera) {
        int maximo=PosicionesMaximo.maximo(loQueUstedQuiera);
        for (int i = 0; i < loQueUstedQuiera.length; i++) {
            if(loQueUstedQuiera[i]== maximo){
                return i;
            }
        }
        return -1;
    }




    public static int maximo(int[] a){
        int[] miPropioArray=Arrays.copyOf(a,a.length);
        int maximo=miPropioArray[0];
        for (int valor :
                miPropioArray) {
            maximo=Math.max(maximo,valor);
        }
        return maximo;
    }
}
