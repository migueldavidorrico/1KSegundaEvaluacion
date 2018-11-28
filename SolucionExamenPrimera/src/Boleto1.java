public class Boleto1 {
    public static void main(String[] args) {
        int numeroPrimero=0;
        for (int i = 0; i < 10; i++) {
            int numeroActual=numeroPrimero;
            for (int j = 0; j < 5; j++) {
                if(numeroActual==0){
                    System.out.println("  ");
                } else {
                    System.out.print("  " + numeroActual);
                }
                numeroActual += 10;
            }
            numeroPrimero++;
            System.out.println("");
        }
    }
}
