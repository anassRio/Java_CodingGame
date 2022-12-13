package katas.kata5;

public class kata5 {
    static double approx(double[][] pts){
        return 0d;
    }

    // TODO: 03/12/2022
    public static void main(String[] args) {

        double[][] rands = new double[100000][2];
        for(int i = 0; i < rands.length; i++){
            rands[i][0] = Math.random(); // x
            rands[i][1] = Math.random(); // y
        }

        System.out.println(approx(rands));
    }
}
