public class Aeropuerto {
    private final String nombre;
    private final String sobrenombre;
    private int pasajeros2017;
    private String tipo; //PRIVADO, PÚBLICO, MILITAR

    public Aeropuerto(String nombre, String sobrenombre, int pasajeros2017) {
        this.nombre = nombre;
        this.sobrenombre = sobrenombre;
        this.pasajeros2017 = pasajeros2017;
    }

    @Override
    public String toString() {
        return nombre + " \'" + sobrenombre + '\'' +
                " " + pasajeros2017 +
                " en 2017";
    }

    public String getNombre() {
        return nombre;
    }

    public String getSobrenombre() {
        return sobrenombre;
    }

    public int getPasajeros2017() {
        return pasajeros2017;
    }

    public void setPasajeros2017(int pasajeros2017) {
        this.pasajeros2017 = pasajeros2017;
    }
}
