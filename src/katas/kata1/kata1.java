package katas.kata1;

public class kata1 {

    static String concat(String[] strings){
        return String.join("",strings);
    }

    public static void main(String[] args) {
        String[] a = {"f","o","o","bar"};

        System.out.println(concat(a));

    }
}
