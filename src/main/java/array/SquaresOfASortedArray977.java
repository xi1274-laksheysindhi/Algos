package array;

import java.util.Arrays;

public class SquaresOfASortedArray977 {

    public static int[] squaresOfASortedArray(int[] num) {
       for(int i = 0; i < num.length; i++) {
           num[i] = num[i]*num[i];
       }
        Arrays.sort(num);
       return num;
    }

    public static void main(String[] args) {
        int[] num = {-4,-1,0,3,10};

        System.out.println(squaresOfASortedArray(num));
    }

}
