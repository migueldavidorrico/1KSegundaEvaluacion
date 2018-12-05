import java.util.Arrays;

public class InicializacionArrays {
    public static void main(String[] args) {
        int[] v = new int[4];
        v[0] = 20;
        v[1] = 15;
        v[2] = 8;
        v[3] = -60;
        int[] a = {30, 70, 76};
        a[0]++;
        int[] b;
        b = a;
        System.out.println(b[1]);
        System.out.println(Arrays.toString(v));
        System.out.println(Arrays.toString(a));

        Pelicula[] netflix;
        netflix = new Pelicula[3];
        netflix[0] = new Pelicula("Lalaland", 2);
        netflix[1] = new Pelicula("Juntos", 6);
        netflix[2] = new Pelicula("Spiderman", 5);
        System.out.println(netflix[2]);
        System.out.println(netflix[0]);

        Pelicula[] HBO = {
                new Pelicula("GOT", 9),
                new Pelicula("Rompe Ralph", 2)
        };

        System.out.println(Arrays.toString(HBO));

        String[] listaClase = {
                "ana",
                "bea",
                "clara",
                "delia",
                "elena"
        };

        System.out.println(listaClase.length);
        System.out.println("************************");
        //RECORRIDO
        for (int i = 0; i < listaClase.length; i++) {
            System.out.println(listaClase[i]);
        }
        //EMPIEZAN POR VOCAL
        for (int i = 0; i < listaClase.length; i++) {
            String nombreActual = listaClase[i];
            if (nombreActual.charAt(0) == 'a' ||
                    nombreActual.charAt(0) == 'e' ||
                    nombreActual.charAt(0) == 'i' ||
                    nombreActual.charAt(0) == 'o' ||
                    nombreActual.charAt(0) == 'u') {
                System.out.println(nombreActual);
            }
        }

        int[] val = {13, -4, 82, 17};
        int[] twice;

        System.out.println( "Original Array: "
                + val[0] + " " + val[1] + " " + val[2] + " " + val[3] );

        // Construct an array object for twice.
        twice=new int[val.length];

        // Put values in twice that are twice the
        // corresponding values in val.

        twice[0]=val[0]*2;
        twice[1]=val[1]*2;
        twice[2]=val[2]*2;
        twice[3]=val[3]*2;

        System.out.println( "New Array: "
                + twice[0] + " " + twice[1] + " " + twice[2] + " " + twice[3] );
        int[] valA   = { 13, -22,  82,  17};
        int[] valB   = {-12,  24, -79, -13};
        int[] sum    = {  0,   0,   0,   0};

        // Add values from corresponding cells of valA and valB
        // and put the result in the corresponding cell of sum.
        sum[0]=valA[0]+valB[0];
        sum[1]=valA[1]+valB[1];
        sum[2]=valA[2]+valB[2];
        sum[3]=valA[3]+valB[3];



        System.out.println( "sum: "
                + sum[0] + " " + sum[1] + " " + sum[2] + " " + sum[3] );
    }
}
