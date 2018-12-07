import javax.swing.*;

public class HolaMundo2 {
    public static void main(String[] args) {
        if(args.length==0) {
            JOptionPane. showMessageDialog(null, "Hola Mundo");
        } else {
            if("--help".equals(args[0])){
                System.out.println("Uso: sin argumentos");
            } else {
                System.out.println("Argumentos no reconocidos");
            }
        }
    }
}
