package es.miguel.primerok.arrays;

public class NIF {
    public static void main(String[] args) {
        int numeroDNI=76935122; //K
        char[] correspondencia={'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        int resto=numeroDNI%23;
        System.out.println(numeroDNI + "-" + correspondencia[resto]);
    }
}
