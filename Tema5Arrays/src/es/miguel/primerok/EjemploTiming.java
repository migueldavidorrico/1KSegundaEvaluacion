package es.miguel.primerok;

public class EjemploTiming {
    public static void main(String[] args) {
        int tamanyoArray=1000000;
        for (int j = 0; j < 100; j++) {
            int[] vector=CapicuaArray.devuelveCapicua(tamanyoArray);
//            long startTime = System.nanoTime();
//            CapicuaArray.capicua1(vector);
//            long endTime = System.nanoTime();
//
//            long duration = (endTime - startTime)/1000000; //divide by 1000000 to get milliseconds.
            long duration=30;
            long startTime2 = System.nanoTime();

            CapicuaArray.capicua2(vector);
            long endTime2 = System.nanoTime();

            long duration2 = endTime2/1000000 - startTime2/1000000; //divide by 1000000 to get milliseconds.
            System.out.println(tamanyoArray+"-"+duration+" - "+duration2);
            tamanyoArray+=1000000;
        }

    }
}
