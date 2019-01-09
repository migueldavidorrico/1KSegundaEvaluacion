import javax.swing.*;
import java.util.Arrays;

public class ConcatenarArrays {
    public static void main(String[] args) {
        int tamanyoPrimero=leerEntero();
        int[] primero=ESArrays.leeArrayGUI(tamanyoPrimero);
        int tamanyoSegundo=leerEntero();
        int[] segundo=ESArrays.leeArrayGUI(tamanyoSegundo);
        String mensaje= "Has introducido: \n"+Arrays.toString(primero)+"\n"+Arrays.toString(segundo);
        JOptionPane.showMessageDialog(null,mensaje);
        int[] union=concatenar(primero,segundo);
        JOptionPane.showMessageDialog(null,Arrays.toString(union));
    }

    private static int[] concatenar(int[] primero, int[] segundo) {
        int[] salida=new int[primero.length+segundo.length];
        int posicionInsertar=0;
        for (int v :
                primero) {
            salida[posicionInsertar++]=v;
        }
        for (int v :
                segundo) {
            salida[posicionInsertar++]=v;
        }
        return salida;
    }

    private static int leerEntero() {
        while(true) {
            String entrada = JOptionPane.showInputDialog("Tamaño");
            if(entrada==null || "".equals(entrada)){
                continue;
            }
            try {
                int entero = Integer.parseInt(entrada);
                return entero;
            } catch(NumberFormatException nfe){
                JOptionPane.showMessageDialog(null, "Entero no reconocido");
            }
        }
    }
}
