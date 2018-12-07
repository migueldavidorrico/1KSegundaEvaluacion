import javax.swing.*;

public class PruebasArraysGUI {
    public static void main(String[] args) {
//        String nombre=JOptionPane.showInputDialog("Nombre?:");
//        System.out.println("Hola, " + nombre);
//        String nac=JOptionPane.showInputDialog("Nacionalidad","Escriba su nacionalidad");
//        String[] niveles={"A1","A2","B1","B2","C1","C2","Shakespeare"};
//        Icon miIcono=new ImageIcon("uk.jpeg");
//        String salida="";
//        do{
//            salida=(String)JOptionPane.showInputDialog(
//                    null,
//                    "Elija Nivel de Inglés",
//                    "Nivel de Inglés",
//                    JOptionPane.YES_OPTION,
//                    miIcono,
//                    niveles,
//                    niveles[0]
//            );
//            if(salida==null){
//                JOptionPane.showMessageDialog(null,"Debes introducir un nivel");
//            }
//        } while(salida==null);
//        System.out.println(salida);
        String[] direccion={"NORTE","ESTE","OESTE","SUR"};
        int respuesta=JOptionPane.showOptionDialog(null,
                "Introduce Dirección",
                "DIRECCION",
                JOptionPane.PLAIN_MESSAGE,
                JOptionPane.WARNING_MESSAGE,
                null,
                direccion,
                direccion[0]);
        System.out.println(respuesta);
    }
}
