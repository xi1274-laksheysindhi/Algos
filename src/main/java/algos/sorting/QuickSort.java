package algos.sorting;

public class QuickSort {

    private static int[] sort(int[] input, int high, int low) {
        if(low < high) {
            int partitionIndex = partition(input, high, low);
            sort(input, partitionIndex, low);
            sort(input,  high, partitionIndex + 1);
        }
        return input;
    }

    private static int partition(int[] arr, int high, int low) {
        int pivot = arr[high-1];
        int i = low-1;
        for(int j = low; j < high; j++) {
            if(pivot >= arr[j]) {
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        return i;
    }


    public static void main(String[] args) {
        int[] input = {5, 7, 3, 12, 11, 2, 8};
        System.out.println(sort(input, input.length, 0));
    }
}
