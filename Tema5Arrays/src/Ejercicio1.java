import javax.swing.*;
import java.util.Arrays;

public class Ejercicio1 {
    public static void main(String[] args) {
        int[] entrada=ESArrays.leeArrayGUI(5);

        JOptionPane.showMessageDialog(null,ESArrays.muestraGUI(entrada));
    }
}
