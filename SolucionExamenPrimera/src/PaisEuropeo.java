public class PaisEuropeo {
    private final String nombre;
    private int poblacion;
    private final String dominio;
    private static int fondoComun=0;
    private int saldo;

    public PaisEuropeo(String nombre, int poblacion, String dominio) {
        this.nombre = nombre;
        this.poblacion = poblacion;
        this.dominio = dominio;
        this.saldo=0;
    }

    public PaisEuropeo(String nombre, int poblacion) {
        this(nombre,poblacion,nombre.substring(0,2).toLowerCase());
    }

    public String getNombre() {
        return nombre;
    }

    public int getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(int poblacion) {
        this.poblacion = poblacion;
    }

    public String getDominio() {
        return dominio;
    }

    public static int getFondoComun() {
        return fondoComun;
    }


//    public int getSaldo() {
//        return saldo;
//    }

    public void aportar(int cantidad){
        this.saldo+=cantidad;
        fondoComun+=cantidad;
    }

    public void retirar(int cantidad){
        this.saldo-=cantidad;
        fondoComun-=cantidad;
    }

    public char getCategoria(){
        if(this.saldo>100000){
            return 'A';
        }
        if(this.saldo>=0){
            return 'B';
        }
        return 'C';
    }

    public static double mediaDosPaises(PaisEuropeo p1,PaisEuropeo p2){
        return (p1.getPoblacion()+p2.getPoblacion())/2.0;
    }
    //EXTRA: NO ESTÁ EN EL EXAMEN

    public double mediaConPais(PaisEuropeo p){
        return (this.poblacion+p.getPoblacion())/2.0;
    }

    //PROGRAMA DE PRUEBA SOLO PARA LA MEDIA
    public static void main(String[] args) {
        PaisEuropeo espanya=new PaisEuropeo("España",50);
        PaisEuropeo francia=new PaisEuropeo("Francia",60);
        //Llamada con el método del examen
        System.out.println(PaisEuropeo.mediaDosPaises(espanya, francia));
        //Llamada con el extra
        System.out.println(espanya.mediaConPais(francia));

    }


}
