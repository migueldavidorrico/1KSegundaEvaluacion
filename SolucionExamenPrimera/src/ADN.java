public class ADN {
    public static String devuelveComplementario(String cadena){
        String salida="";
        for (int i = 0; i < cadena.length(); i++) {
            char aAnyadir;
            switch(cadena.charAt(i)) {
                case 'A':aAnyadir='T';
                break;
                case 'T':aAnyadir='A';
                break;
                case 'C':aAnyadir='G';
                break;
                case 'G':aAnyadir='C';
                break;
                default:aAnyadir=cadena.charAt(i);
                break;
            }
            salida+=aAnyadir;
        }

        return salida;
    }

    public static void main(String[] args) {
        System.out.println(ADN.devuelveComplementario("ATTGC"));
        System.out.println(ADN.devuelveComplementario("GTAT"));
    }
}
