public class Enmascara {
    public static String enmascara(String cadena){
        if(cadena.length()<=4){
            return cadena;
        }

        String salida="";
        for (int i = 0; i < cadena.length(); i++) {
            if(i<cadena.length()-4){
                salida+="#";
            } else {
                salida+=cadena.charAt(i);
            }
        }

        return salida;
    }

    public static void main(String[] args) {
        System.out.println(Enmascara.enmascara("4556364607935616"));
        System.out.println(Enmascara.enmascara("64607935616"));
        System.out.println(Enmascara.enmascara("1"));
        System.out.println(Enmascara.enmascara(""));
// "¿Cuál era el nombre de tu primera mascota?"
        System.out.println(Enmascara.enmascara("Skippy"));
        System.out.println(Enmascara.enmascara("Nanananananananananananananananananananan Batman!"));
    }
}
