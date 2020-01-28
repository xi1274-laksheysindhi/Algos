package array;

import java.util.Arrays;

public class HeightChecker1051 {

    public static int heightChecker(int[] nums) {
        int maxNum = 0;
        int[] i = Arrays.copyOf(nums, nums.length);
        Arrays.sort(nums);
        for(int j = 0; j < nums.length; j++) {
            if(nums[j] != i[j]) {
                maxNum++;
            }
        }
        return maxNum;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,4,2,1,3};
        System.out.println(heightChecker(nums));
    }
}
