package array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayPartitionI561 {

    public static int arrayPartition(int[] nums) {
        int maxNum = 0;
        Arrays.sort(nums);
        for(int j = 0; j < nums.length; j++) {
            if(j%2 == 0) {
                maxNum = maxNum  + Math.min(nums[j], nums[j+1]);
            }
        }
        return maxNum;
    }

    public static void main(String[] args) {
        int[] nums = {1,4,3,2};
        System.out.println(arrayPartition(nums));
    }

}
