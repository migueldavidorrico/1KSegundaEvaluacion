package es.miguel.primerok;

import javax.swing.*;
import java.lang.reflect.Array;

public class ConcatenaVarios {
    public static void main(String[] args) {

        int numeroArrays= Integer.parseInt(JOptionPane.showInputDialog("Número de Arrays?"));
        Arreglo[] misArrays=new Arreglo[numeroArrays];
        for (int i = 0; i < numeroArrays; i++) {
            int tamanyoActual=Integer.parseInt(JOptionPane.showInputDialog("Tamanyo del Array "+(i+1)));
            misArrays[i]=new Arreglo("Array: "+(i+1),tamanyoActual);
            misArrays[i].setDatos(ESArrays.leeArrayGUI(tamanyoActual));
        }

        int longitudFinal=0;
        for (Arreglo a :
                misArrays) {
            longitudFinal+=a.getLongitud();
        }

        int[] union=new int[longitudFinal];
        int posicionInsertar=0;
        for (Arreglo a :
                misArrays) {
            for (int valor :
                    a.getDatos()) {
                union[posicionInsertar++]=valor;
            }
        }
        JOptionPane.showMessageDialog(null,ESArrays.muestraGUI(union));

    }
}
