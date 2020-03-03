package array;

import java.util.Arrays;

public class searchInRotatedSortedArray33 {

    int result = -1;

    public static int search(int[] nums, int target) {

        return searchInRotatedSortedArray(nums, target, 0, nums.length-1);

    }

    public static int searchInRotatedSortedArray(int[] nums, int target, int start, int end) {
        int middle = (end+start)/2;

        if(middle == end) {
            return -1;
        }

       if(target == nums[start]) {
           return start;
       } else if(target == nums[end]) {
           return end;
       }

       if(nums[middle] < nums[start] && target < nums[start]) {
                return searchInRotatedSortedArray(nums, target, middle, end);
       } else if(nums[middle] < nums[start] && target > nums[start]) {
           return searchInRotatedSortedArray(nums, target, start, middle);
       }
         if(nums[middle] < target) {
            return searchInRotatedSortedArray(nums, target, middle, end);
        } else {
             return  searchInRotatedSortedArray(nums, target, start, middle);
        }

    }

    public static void main(String[] args) {
        int[] nums = new int[]{4,5,6,7,0,1,2};
        int find = 3;
        search(nums, find);
    }
}
