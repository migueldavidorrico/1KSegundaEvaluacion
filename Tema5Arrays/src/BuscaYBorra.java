import java.lang.reflect.Array;
import java.util.Arrays;

public class BuscaYBorra {
    public static void main(String[] args) {
        Persona[] lista={
                new Persona("Ana",32),
                new Persona("Bea",43),
                new Persona("Clara",54),
                new Persona("Delia",98),
                new Persona("Elena",12),
                new Persona("Flori",15),
        };

        System.out.println(Arrays.toString(lista));
        System.out.println(buscaPersonaPosicion(lista, "Delia"));
        encuentraPersona(lista,"elena").setEdad(40);
        System.out.println(Arrays.toString(lista));
        lista=borraPosicion(lista,1);
        System.out.println(Arrays.toString(lista));


    }


    public static Persona[] borraPosicion(Persona[] p,int posicion){
        Persona borrada=p[posicion];
        for (int i = posicion; i < p.length-1; i++) {
            p[i]=p[i+1];
        }
        p= Arrays.copyOf(p,p.length-1);
        return p;
    }

    public static int buscaPersonaPosicion(Persona[] p,String nombre){
        for (int i = 0; i < p.length; i++) {
            if(p[i].getNombre().equalsIgnoreCase(nombre)){
                return i;
            }
        }
        return -1;
    }
    public static Persona encuentraPersona(Persona[] p, String nombre){
        for (Persona actual :
                p) {
            if(actual.getNombre().equalsIgnoreCase(nombre)){
                return actual;
            }

        }
        return null;
    }
}
