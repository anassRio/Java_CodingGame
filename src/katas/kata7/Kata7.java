package katas.kata7;

import java.io.PrintStream;
import java.util.Scanner;

public class Kata7 {
    // TODO: 03/12/2022
    public static String solve(int width, int height, int length, int mass){

        return "";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //game Loop
        while (true) {
            int width = in.nextInt();
            int height = in.nextInt();
            int length = in.nextInt();
            int mass = in.nextInt();

            PrintStream outStream = System.out;
            System.setOut(System.err);
            String action = solve(width,height,length,mass);
            System.setOut(outStream);
            System.out.println(action);
        }
    }
}