package katas.kata4;

public class Kata4 {

    static int sumRange (int[] ints){
        int sum = 0;
        for(int i = 1; i < ints.length; i++){
            int n = ints[i];
            if(n >= 10 && n <= 100) sum += n;
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] ints = {1, 20, 3, 10, -2, 100};
        int result = sumRange(ints);
        System.out.println("Result : " + result);
        System.out.println("Excepted result : 130");
    }
}
