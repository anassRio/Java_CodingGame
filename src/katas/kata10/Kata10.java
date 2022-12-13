package katas.kata10;

import java.util.Arrays;

public class Kata10 {

    public static String[] filterWords(String[] words, String letters){

        Arrays.stream(words).allMatch(letters::contains);
        return null;
    }

    public static void main(String[] args) {

        String[] words = {"the", "dog", "got", "a", "bone"};
        String letters = "a";

        System.out.println(filterWords(words,letters));
    }
}
