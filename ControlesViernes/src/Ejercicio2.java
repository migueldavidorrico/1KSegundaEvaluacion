import java.lang.reflect.Array;
import java.util.Arrays;

public class Ejercicio2 {
    public static void main(String[] args) {
        Aeropuerto[] lista={
                new Aeropuerto("Alicante-Elche","El Altet",13713081),
                new Aeropuerto("Murcia-San Javier","San Javier",1196605),
                new Aeropuerto("Valencia","Manises",6_745_394)
        };

        for (Aeropuerto a:lista
             ) {
            System.out.println(a);
        }

    }
}
