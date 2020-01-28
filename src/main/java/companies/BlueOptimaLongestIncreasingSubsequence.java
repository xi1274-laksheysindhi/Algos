/* Dynamic Programming Java implementation of LIS problem */


// create a dummy array of same size and initalize all the indexes as 1

// if found same or greater than previous add one in the array we initialized with 1s


class BlueOptimaLongestIncreasingSubsequence
{
    /* lis() returns the length of the longest increasing
    subsequence in arr[] of size n */
    static int[] lis(int arr[],int n)
    {
        int lis[] = new int[n];
        int i,j,max = 0;


        for ( i = 0; i < n; i++ )
            lis[i] = 1;


        for ( i = 1; i < n; i++ )
            for ( j = 0; j < i; j++ )
                if ( arr[i] >= arr[j] && lis[i] < lis[j] + 1)
                    lis[i] = lis[j] + 1;

        return lis;
    }

    public static void main(String args[])
    {
        int arr[] = { 10, 22, 9, 33, 21, 50, 41, 60 };
        int n = arr.length;
        System.out.println("Length of lis is " + lis( arr, n ) + "\n" );
    }
}
/*This code is contributed by Rajat Mishra*/
