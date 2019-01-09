package es.miguel.primerok;

import javax.swing.*;
import java.util.Arrays;

public class EjemploSplit {
    public static void main(String[] args) {
        String nombres="ana.bea.clara.delia.elena.flori";
        String[] lista=nombres.split(".");
        System.out.println(Arrays.toString(lista));
        String entrada= JOptionPane.showInputDialog("Introduce la edad");
        int edad=Integer.parseInt(entrada);

    }
}
