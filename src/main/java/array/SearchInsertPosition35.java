package array;

public class SearchInsertPosition35 {

    public static int searchInsert(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == target ) {
                return  i;
            } else if(i == 0 && nums[0] > target) {
                return 0;
            } else if(i+1 != nums.length && nums[i] < target && nums[i+1] > target) {
                return i+1;
            }
        }

        return nums.length;

    }


    public static void main(String[] args) {
        int[] nums = {1,3};
        int target = 2;
        searchInsert(nums, target);

    }

}
