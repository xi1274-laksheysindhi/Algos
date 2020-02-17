package string;

public class FindNumbersWithEvenNumberOfDigits1295 {
    static int count =0;

    static int findNumbersWithEvenNumberOfDigits1295(int[] nums) {
        for(int i = 0; i < nums.length; i++) {
            int length = Integer.toString(nums[i]).length();

        if(length %2 == 0) {
            count++;
        }
        }
        return count;
    }


    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896};
        System.out.println(findNumbersWithEvenNumberOfDigits1295(nums));
    }
}
