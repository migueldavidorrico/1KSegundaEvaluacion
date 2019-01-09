public class Persona {
    private final String nombre;
    private int edad;
    private int sueldoBase;

    public int getSueldo() {
        int sueldo=sueldoBase;
        if(edad>50){
            sueldo+=100;
        }
        if(edad>60){
            sueldo+=200;
        }
        return sueldo;
    }

    public void setSueldoBase(int sueldo) {
        this.sueldoBase = sueldo;
    }

    public Persona(Persona p){
        this.nombre=p.nombre;
        this.edad=p.edad;
        this.sueldoBase=p.sueldoBase;
    }

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    @Override
    public String toString() {
        return nombre + '-' + edad+" "+sueldoBase+"€"+'\n';
    }
}
