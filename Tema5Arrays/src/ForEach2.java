public class ForEach2 {
    public static void main(String[] args) {
        int[] p={4,6,4,34,5,53,42,3,4};
        for (int i :
                p) {
            System.out.println(i);
        }
        Persona[] lista={
                new Persona("Ana",34),
                new Persona("Bna",34),
                new Persona("Cna",34),
                new Persona("Ena",34),
                new Persona("Fna",34),
        };
        for (Persona persona:
             lista) {
            persona=new Persona("EPPE",43);
            System.out.println(persona.getNombre()+" "+persona.getEdad());
        }
        System.out.println(lista[3].getNombre());
    }
}
