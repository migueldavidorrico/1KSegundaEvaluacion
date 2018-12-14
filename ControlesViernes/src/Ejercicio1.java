public class Ejercicio1 {
    public static void main(String[] args) {
        Aeropuerto[] lista;

        lista=new Aeropuerto[2];

        lista[0]=new Aeropuerto("Alicante-Elche","El Altet",13713081);
        lista[1]=new Aeropuerto("Albacete","Los Llanos",1380);


        System.out.println(lista[0]);
        System.out.println(lista[1]);
    }
}
