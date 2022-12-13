package katas.kata9;

import java.util.Arrays;

public class Kata9 {
    static int findLargest( int[] numbers){
         return Arrays.stream(numbers).reduce(0, (a, b) -> Integer.max(a, b));
    }

    public static void main(String[] args) {
        int[] numbers = {1, -28, 88, 200, 7};
        System.out.println(findLargest(numbers));
    }
}
