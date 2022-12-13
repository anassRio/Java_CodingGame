package katas.kata3;

public class Kata3 {

    static boolean a( int i, int j){
        return (i == 1 || j == 1 || i+j == 1);
    }

    public static void main(String[] args) {
        System.out.println(a(1,5));
        System.out.println(a(2,3));
        System.out.println(a(-3,4));
    }
}
