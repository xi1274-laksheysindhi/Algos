package array;

public class MoveZeroes283 {

    public static void moveZeroes(int[] nums) {
        int zerosToMove = 1;
        int count = 0;
        for(int i =0 ; i < nums.length-1; i++) {
            if(nums[i] == 0 && nums[i+1] == 0) {
                zerosToMove++;
                continue;
            }
            if(nums[i] == 0 && nums[i+1] != 0) {
               int temp = nums[i+1];
               while(zerosToMove != count) {
                   nums[i- count + 1] = nums[i-count];
                   count++;
               }
               nums[i-count+1] = temp;
               count = 0;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {0,1,0,3,12};
        moveZeroes(arr);
    }
}
