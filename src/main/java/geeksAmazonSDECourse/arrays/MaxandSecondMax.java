package geeksAmazonSDECourse.arrays;

public class MaxandSecondMax {

    // Function to find largest and second largest element in the array
    static void largestAndSecondLargest(int sizeOfArray, int arr[]){

        int max = arr[1];
        int max2 = -1;

        /*********************************
         * Your code here
         * This function should print
         * max and second max
         * *******************************/


        for(int i = 1; i< arr.length; i++) {

            if(arr[i] >= max) {
                if(arr[i] == max) {
                    continue;
                }
                max2 = max;
                max = arr[i];
            } else if(arr[i] >= max2) {
                if(arr[i] == max2) {
                    continue;
                }
                max2 = arr[i];
            }


        }
        System.out.println(max + " " + max2);
    }
}
