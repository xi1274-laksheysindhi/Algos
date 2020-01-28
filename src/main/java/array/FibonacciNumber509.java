package array;


public class FibonacciNumber509 {

    public static int fibonacciNumber(int nums) {
        if(nums == 0) {
            return 0;
        }
        int[] fibo = new int[nums+1];
        fibo[0] = 0;
        fibo[1] = 1;
        for(int j = 2; j <= nums; j++) {
           fibo[j] = fibo[j-1] + fibo[j-2];
        }

        return fibo[nums];
    }

    public static void main(String[] args) {
        int nums = 0;
        System.out.println(fibonacciNumber(nums));
    }
}
