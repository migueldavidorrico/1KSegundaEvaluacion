import javax.swing.*;


public class ConcatenacionArray {
    public static void main(String[] args) {
        int[] primerArray= new int[leerEntero("La dimensión del primer array es: ")];
        int[] segundoArray= new int[leerEntero("La dimensión del segundo array es: ")];
        int[] arrayConcatenado = new int[primerArray.length+segundoArray.length];
        escribirArray(primerArray);
        System.out.println("Has introducido los siguientes valores para el primer array: ");
        mostrar(primerArray);
        System.out.println("");
        escribirArray(segundoArray);
        System.out.println('\n'+"Has introducido los siguientes valores para el segundo array: ");
        mostrar(segundoArray);

    }

    private static int leerEntero(String dimension) {
        System.out.println(dimension);
        int num=Integer.parseInt(JOptionPane.showInputDialog(dimension));
        return num;
    }
    private static void escribirArray(int[] escribirArray){
        for(int i=0;i<escribirArray.length;i++){
            escribirArray[i] = leerEntero("Inserta el valor " + (i+1) + ": ");
        }
    }
    private static void mostrar(int[] array){
        for (int i=0; i<array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}