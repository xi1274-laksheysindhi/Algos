package algos.sorting;


public class MergeSort {

    private static int[] sort(int[] input, int high, int low) {
          int pivot = (low+high)/2;
          if(high > low) {
              sort(input, pivot, low);
              sort(input, high, pivot+1);
              compare(input, low, high, pivot);
          }
       return input;
    }

    private static void compare(int[] arr, int low,int  high, int middle) {
        int[] tempLeft  = new int[middle-low+1];
        int[] tempRight = new int[high-middle];

        for(int i = 0; i < middle-low+1;i++) {
            tempLeft[i] = arr[low+i];
        }

        for(int i = 0; i < high-middle ;i++) {
            tempRight[i] = arr[middle+1+i];
        }

        int j = 0;
        int o =0;
        int k = low;

        while(j != tempLeft.length && o != tempRight.length) {
            if(tempLeft[j] > tempRight[o]) {
                arr[k] = tempRight[o];
                o++;
            } else {
                arr[k] = tempLeft[j];
                j++;
            }
            k++;
        }

        while(j != tempLeft.length) {
            arr[k]  = tempLeft[j];
            j++;
        }


        while(o != tempRight.length) {
            arr[k]  = tempRight[o];
            o++;
        }
    }


    public static void main(String[] args) {
        int[] input = {5, 7, 3, 12, 11, 2, 8};
        System.out.println(sort(input, input.length -1, 0));
    }
}
