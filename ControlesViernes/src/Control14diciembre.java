import java.util.Arrays;

public class Control14diciembre {
    public static void main(String[] args) {
        Aeropuerto[] aena={
                new Aeropuerto("Madrid","Barajas",3_000_000),
                new Aeropuerto("Castellón","Caste",2),
                new Aeropuerto("Caceres","Sevilla",9_000_000),
                new Aeropuerto("Barcelona","El Prat",5_000),
        };
        System.out.println("La cantidad de pasajeros de 2017 es: " + cantidadPasajeros(aena));
        Aeropuerto minimo=aeropuertoMinimo(aena);
        System.out.println("El aeropuerto menos usado es: " + minimo);
        System.out.println("Le sumo 5000 pasajeros al mínimo");
        minimo.setPasajeros2017(minimo.getPasajeros2017()+5000);
        System.out.println("Lista de Aeropuertos:");
        System.out.println(Arrays.toString(aena));
        System.out.println("Hay " + empiezaPor(aena, 'C') + " aeropuertos que empiezan por C");
    }

    public static int empiezaPor(Aeropuerto[] lista,char inicial){
        int contador=0;
        for (Aeropuerto a :
                lista) {
            if(a.getNombre().charAt(0)==inicial){
                contador++;
            }
        }
        return contador;
    }

    public static Aeropuerto aeropuertoMinimo(Aeropuerto[] lista){
        Aeropuerto minimo=lista[0];
        for (Aeropuerto a:
             lista) {
            if(a.getPasajeros2017()<minimo.getPasajeros2017()){
                minimo=a;
            }
        }
        return minimo;
    }

    public static int cantidadPasajeros(Aeropuerto[] lista){
        int suma=0;
        for (Aeropuerto a:
             lista) {
            suma+=a.getPasajeros2017();
        }
        return suma;
    }
}
