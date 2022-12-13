package katas.kata10;

import java.util.Arrays;

public class test {

    static int findLargest(int[] numbers){
        return Arrays.stream(numbers).max().getAsInt();
    }

    public static void main(String[] args) {
        int[] numbers = {1, -28, 88, 200, 7};
        int result = findLargest(numbers);
        System.out.println(result);
    }
}
