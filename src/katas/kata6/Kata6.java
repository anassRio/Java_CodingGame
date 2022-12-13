package katas.kata6;

import java.util.Arrays;

public class Kata6 {

    public static int[] filterDuplicates(int[] data){

        return Arrays.stream(data).distinct().toArray();
        //return new LinkedList(Arrays.asList(data)).toArray();
        //return new HashSet(Arrays.asList(data)).toArray();
    }

    public static void main(String[] args) {

        int[] data = {7, 3, 6, 4, 3, 3, 4, 9};
        Arrays.stream(filterDuplicates(data)).forEach(s -> System.out.println(s));

    }
}
