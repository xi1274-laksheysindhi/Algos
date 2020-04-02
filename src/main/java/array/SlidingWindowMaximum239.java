package array;

import java.util.Deque;
import java.util.LinkedList;


// In this the approach followed is .
// starting with 1,3,1,2,0,5 here i will first take window size and apply loop like in this case its 3
// I will maintain 1 deque(coz all the max will be there from left to right)
// queue will always maintain max to min from left to right
// https://www.geeksforgeeks.org/sliding-window-maximum-maximum-of-all-subarrays-of-size-k/

public class SlidingWindowMaximum239 {

    public static int[] maxSlidingWindow(int[] nums, int k) {
        if(nums.length == 0) {
            return new int[0];
        }
        int count = 0;
        int max[] = new int[nums.length+1-k];
        Deque<Integer> l = new LinkedList<>();
        l.addLast(0);
        int i;
        for(i =1 ; i < k; i++) {
            while(!l.isEmpty() && nums[i] > nums[l.peekLast()]) {
                l.removeLast();
            }
            l.addLast(i);

        }
        max[count++] = nums[l.peekFirst()];

        for(; i < nums.length; i++) {

            while(!l.isEmpty() && i-l.peekFirst() >= k) {
                l.removeFirst();
            }

            while(!l.isEmpty() && nums[i] > nums[l.peekLast()]) {
                l.removeLast();
            }

            l.addLast(i);
            max[count++] = nums[l.peekFirst()];
        }

        return max;
    }

    public static void main(String[] args) {

        int[] arr = {1,3,1,2,0,5};
        int k = 3;
        maxSlidingWindow(arr, k);

    }
}
