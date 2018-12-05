import java.util.Arrays;

public class Pruebas {
    public static void main(String[] args) {

        Pelicula[] netflix;             //        int[] v;
        netflix=new Pelicula[4];        //        v=new int[4];
        Pelicula[] HBO=new Pelicula[5]; //        int[] c=new int[5];
        System.out.println(netflix);   //        //Truco: imprimir un array: Arrays.toString(array);
        System.out.println(Arrays.toString(netflix));
        netflix[0]=new Pelicula("300",10);        //        v[0]=5;
        System.out.println(Arrays.toString(netflix));  //        System.out.println(Arrays.toString(v));
        netflix[3]=new Pelicula("Batman",11);
        netflix[3].setValoracion(2);        //        v[3]++;
        System.out.println(netflix[3]);


    }
}
