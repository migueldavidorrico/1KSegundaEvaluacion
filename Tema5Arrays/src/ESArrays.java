import javax.swing.*;

public class ESArrays {
    public static int[] leeArrayGUI(int tamanyo) {
        int[] salida=new int[tamanyo];
        JOptionPane.showMessageDialog(null,"Vas a introducir "+tamanyo+" enteros");
        for (int i = 0; i < salida.length; i++) {
            String indicacion="";
            if(i>0){
                indicacion="Llevas introducidos: ";
                for (int j = 0; j < i; j++) {
                    indicacion+=salida[j]+" ";
                }
            }
            salida[i]=Integer.parseInt(JOptionPane.showInputDialog(indicacion+"\n"+"Introduzca el número "+(i+1)));
        }
        return salida;
    }
}
