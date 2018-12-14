//Versión 2 con 3 Arrays.
import javax.swing.*;
import java.util.Arrays;

import static java.lang.Integer.parseInt;

public class MezclaArrays {
    public static void main(String[] args) {

        //int cantidadNumeros = parseInt(JOptionPane.showInputDialog("Introduce la cantidad: "));
        // int[] numerosA= new int[cantidadNumeros];
        int[] arriba = {-100,-300,-800};
        // int[] numerosB= new int[cantidadNumeros];
        int[] abajo= {0,1,2};
        int[] mezcla = new int[arriba.length+abajo.length];

        int numeroQueEstoyEligiendo=0;
        String leTocaA="arriba";
        int numeroQueEstoyRellenando=0;
        while(numeroQueEstoyEligiendo<abajo.length){
            if(leTocaA.equals("arriba")){
                mezcla[numeroQueEstoyRellenando]=arriba[numeroQueEstoyEligiendo];
                leTocaA="abajo";
            }else if(leTocaA.equals("abajo")){
                mezcla[numeroQueEstoyRellenando]=abajo[numeroQueEstoyEligiendo];
                numeroQueEstoyEligiendo++;
                leTocaA="arriba";
            }
            numeroQueEstoyRellenando++;
        }
        System.out.println("Numeros introducidos: " + (Arrays.toString(mezcla)));
    }
}
