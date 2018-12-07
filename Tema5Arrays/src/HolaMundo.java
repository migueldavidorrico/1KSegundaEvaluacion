public class HolaMundo {
    public static void main(String[] args) {
        System.out.println("Me han pasado " + args.length+" Argumentos");
        System.out.println("Los imprimo");
        for (String s :
                args) {
            System.out.println("Argumento: " + s);
        }
    }
}
