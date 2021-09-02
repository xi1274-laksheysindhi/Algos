package dynamicProgramming;

public class FibonacciSeries {


    public static int[] byIteration(int number) {
        int[] arr  = new int[number];
        arr[0] = 0;
        arr[1] = 1;
        for(int i = 2; i < number; i++) {
            arr[i] = arr[i-1]+arr[i-2];
        }
        return arr;
    }

    public static int[] byRecursion(int number) {
       int[] arr = new int[number];
        for(int i = 0; i< number; i++) {
            arr[i] = recursion(i);
        }

        return arr;
    }

    public static int recursion(int n) {

        if(n <= 1) {
            return n;
        }

        return recursion(n-1)+recursion(n-2);


    }


    public static int dynamicProgramming(int n, int[] f) {


            f[n] = f[n - 1] + f[n - 2];


        // Nth Fibonacci Number
        return f[n];

    }

    public static int dp(int n) {
        int f[] = new int[n + 2];
        f[0] = 0;
        f[1] = 1;
        for(int i =2; i < n; i++) {
            System.out.print(dynamicProgramming(i, f)+" ");
        }

        return 0;
    }




    public static void main(String[] args) {

        recursion(10);
    }
}
