public class PruebaAeropuerto {
    public static void main(String[] args) {
        Aeropuerto nuevo=ESAeropuerto.leeAeropuerto();
        if(nuevo==null){
            System.out.println("Has decidido no introducir un aeropuerto");
            return;
        }
        System.out.println(nuevo);

    }
}
