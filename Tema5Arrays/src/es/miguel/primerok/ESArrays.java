package es.miguel.primerok;

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


    public static String muestraGUI(int[] entrada) {
        String salida="<html>";
        salida+="<table style=\"" +
                "border: 1px solid #1C6EA4;" +
                "  background-color: #EEEEEE;" +
                "  width: 100%;" +
//                "  text-align: left;" +
                "  border-collapse: collapse;\">";

        salida+="<tr>";

        for (int i :
                entrada) {
            salida+="<td style=\"border: 3px solid #AAAAAA;color:#EEEEEE" +
                    " padding: 6px 4px;background-color: #220011;\">";
            salida+="<pre style=\"font-size:24px;\">"+i+"</pre>";
            salida+="</td>";
        }

        salida+="</tr></table>";
        salida+="</html>";
        return salida;
    }
}
