/*
package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SumOf3Equals015 {

    public static List<List<Integer>> sumOf3Equals0(int[] num) {
        Arrays.sort(num);
        List<Integer> positive = new ArrayList();
        List<Integer> negative = new ArrayList();

        for(int i =0; i < num.length; i++) {
            if (num[i] > 0) {
                positive.add(num[i]);
            } else {
                negative.add(num[i]);
            }
        }

        positive.stream().forEach( value -> {
            for(int z = 0 ; z < negative.size(); z++) {
                if(Math.abs(negative.get(z)) > value) {
                    break;
                }
                if(negative[z]
            }
        });


        return num;
    }

    public static void main(String[] args) {
        int[] num = {-1, 0, 1, 2, -1, -4};

        System.out.println(sumOf3Equals0(num));
    }
}
*/
