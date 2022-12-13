package katas.kata8;

public class Kata8 {

    static boolean isFoo(String param){
        return "foo".equals(param);
    }

    public static void main(String[] args) {

        System.out.println(isFoo("toto"));
        System.out.println(isFoo("foo"));
        System.out.println(isFoo("fofo"));
    }
}
