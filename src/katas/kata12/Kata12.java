package katas.kata12;

public class Kata12 {

    public static int next(int n){

        String str = Integer.toString(n);
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i ++){
            int current = Character.getNumericValue(str.charAt(i));

            while (str.indexOf(Integer.toString(current)) != -1){
                if( i == 0){
                    if(current < 9){
                        current ++;
                    }else if ( current == 9) {
                        current = 10;
                    }
                }else{
                    current = 0;
                }

            }

            result.append(current);
        }

        return Integer.parseInt(result.toString());
    }

    public static void main(String[] args) {
        //test for 789
        System.out.println(next(789));

        //test for 654321
        System.out.println(next(654));

        //test for 123
        System.out.println(next(123));

        //test for 123
        System.out.println(next(3));

    }
}
