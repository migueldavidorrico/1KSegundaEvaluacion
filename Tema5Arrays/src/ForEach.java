public class ForEach {
    public static void main(String[] args) {
        int[] a={2,354,56,76,435,87,35,897,35};
        for (int v:a
             ) {
            if(v==354){
                v=-400;
            }
        }
        for (int v :
                a) {
            System.out.println(v);
        }
//
//        for(int v:a){
//            System.out.println(v * 2);
//        }
//
    }

}
