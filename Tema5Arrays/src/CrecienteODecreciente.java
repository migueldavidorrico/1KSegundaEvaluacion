




public class CrecienteODecreciente {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5,10};

        int actual=a[0];
        boolean esCreciente=true;
        boolean esDecreciente=true;
        for(int i=1;i<a.length;i++){
            if(actual<a[i]){
//                System.out.println("Es creciente");
               // esDecreciente=false;
            } else if (actual>a[i]){
//                System.out.println("Es decreciente");
                esCreciente=false;
            } else {
//                System.out.println("Se queda igual");
                esCreciente=false;
                esDecreciente=false;
            }
            actual=a[i];
        }
        if(esCreciente){
            System.out.println("es creciente");
        } else if(esDecreciente){
            System.out.println("Es Decreciente");
        } else {
            System.out.println("Es desordenado o con iguales");
        }
    }
}
