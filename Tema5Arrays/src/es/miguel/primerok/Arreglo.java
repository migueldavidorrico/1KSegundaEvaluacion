package es.miguel.primerok;

import javax.swing.*;
import java.util.Arrays;

public class Arreglo {
    int[] datos;
    String nombre;
    Arreglo(String nombre,int tamanyo){
        this.nombre=nombre;
        this.datos=new int[tamanyo];
    }

    public int[] getDatos(){
        return Arrays.copyOf(datos,datos.length);
    }
    public void setDatos(int[] datos){
        this.datos= Arrays.copyOf(datos,datos.length);
    }

    public int getLongitud(){
        return datos.length;
    }

    public static void main(String[] args) {
        Arreglo a=new Arreglo("Primero",5);
        int[] temporal=ESArrays.leeArrayGUI(a.getLongitud());
        a.setDatos(temporal);
        System.out.println(a.getLongitud());
        JOptionPane.showMessageDialog(null,ESArrays.muestraGUI(a.getDatos()));
        temporal[2]=0;
        JOptionPane.showMessageDialog(null,ESArrays.muestraGUI(a.getDatos()));
        temporal=a.getDatos();
        temporal[2]=0;
        JOptionPane.showMessageDialog(null,ESArrays.muestraGUI(a.getDatos()));

    }
}
