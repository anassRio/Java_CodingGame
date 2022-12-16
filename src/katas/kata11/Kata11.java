package katas.kata11;

public class Kata11 {

    private static int count = 0;


    // synchronized : Permet a une class de supporter l'accès concurrentiel de plusieurs threads
    public static synchronized int increment(){

        count = count + 1;
        return count;
    }


}
