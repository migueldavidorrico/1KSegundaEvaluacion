import java.util.Arrays;

public class OrdenarSinRomper {
    public static void main(String[] args) {
        int[] a={9,3,5,1,2,3,80,5,4,5}; //Los insertan así
        System.out.println(Arrays.toString(a));
        int max=calculaMaximo(a);
        System.out.println(Arrays.toString(a));
        System.out.println(max);
        //Mostrar el tercer elemento introducido
        System.out.println(a[2]);
        Persona pepe=new Persona("Pepe",34);
        pepe.setSueldoBase(3000);
        System.out.println(pepe);
        System.out.println(pepe.getSueldo());
        int sueldoFinal=listaDeSueldo10en10anyos(pepe);
        System.out.println("Enhorabuena, " + pepe.getNombre());
        System.out.println("dentro de " + (70 - pepe.getEdad()) + " cobrarás " + sueldoFinal);
        System.out.println(pepe);
        cumpleAnyos(pepe);
        System.out.println(pepe);
    }

    private static void cumpleAnyos(Persona pepe) {
        pepe.setEdad(pepe.getEdad()+1);
    }

    private static int listaDeSueldo10en10anyos(Persona p) {
        Persona temporal=new Persona(p);

        while(temporal.getEdad()<70){
            System.out.println("Con " + temporal.getEdad() + " años " + temporal.getNombre() + " cobra " + temporal.getSueldo() + "€");
            temporal.setEdad(temporal.getEdad()+10);
        }
        return temporal.getSueldo();
    }
//NO HACER ESTÁ MUY MAL PLANTEADO

    private static int calculaMaximo(int[] a) {
        int[] temp=Arrays.copyOf(a,a.length);
        Arrays.sort(temp);
        return temp[temp.length-1];
    }
}
