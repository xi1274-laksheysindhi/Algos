package companies;


public class Zalando2 {

    public static int zalandoQuestion(int[] nums) {
        int moments=nums.length;
        for(int i = 0; i < nums.length; i++) {
            if(!(nums[i] == i-1)) {
                moments--;
            }
        }



        return moments;
    }

    public static void main(String[] args) {
        int nums[] = {2, 1, 3, 5, 4};
        System.out.println(zalandoQuestion(nums));
    }
}
