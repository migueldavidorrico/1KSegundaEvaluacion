public class Ejercicio3 {
    public static void main(String[] args) {
        Aeropuerto[] lista={
                new Aeropuerto("Alicante-Elche","El Altet",13713081),
                new Aeropuerto("Murcia-San Javier","San Javier",1196605),
                new Aeropuerto("Valencia","Manises",6_745_394),
                new Aeropuerto("Albacete","Los Llanos",1381)
        };

        double media;
        int suma;

        //Primera aproximación
        int pasajeros1=lista[0].getPasajeros2017();
        int pasajeros2=lista[1].getPasajeros2017();
        int pasajeros3=lista[2].getPasajeros2017();
        int pasajeros4=lista[3].getPasajeros2017();

        media=(pasajeros1+pasajeros2+pasajeros3+pasajeros4)/4.0;
        System.out.printf("Media: %.2f%n",media);

        //Segunda aproximación
        media=(lista[0].getPasajeros2017()
                +lista[1].getPasajeros2017()
                +lista[2].getPasajeros2017()
                +lista[3].getPasajeros2017())/4.0;
        System.out.printf("Media: %.2f%n",media);

        // Tercera aproximación

        suma=0;
        for (int i = 0; i < 4; i++) {
            suma+=lista[i].getPasajeros2017();
        }
        media=suma/4.0;
        System.out.printf("Media: %.2f%n",media);
        //Cuarta aproximación
        suma=0;
        for (int i = 0; i < lista.length; i++) {
            suma+=lista[i].getPasajeros2017();
        }
        media=suma/(double)lista.length;
        System.out.printf("Media: %.2f%n",media);

        //Aproximación buena
        suma=0;
        for (Aeropuerto a :
                lista) {
            suma+=a.getPasajeros2017();
        }
        media=suma/(double)lista.length;
        System.out.printf("Media: %.2f%n",media);


    }
}
