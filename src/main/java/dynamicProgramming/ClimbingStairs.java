package dynamicProgramming;


// Note climbing stairs problem is same as fibonici series previous 2 results will be addes


public class ClimbingStairs {
    static int climbStairs(int n)
    {
        if(n == 1) {
            return 1;
        }

        int[] ways = new int[n+1];

        ways[1] = 1;
        ways[2] = 2;

        for(int i = 3 ; i <= n ; i++) {
            ways[i] = ways[i-1]+ways[i-2];
        }

        return ways[n];

    }

    public static void main(String args[])
    {
        int i = 1;
        System.out.println(climbStairs(i));
    }

}
