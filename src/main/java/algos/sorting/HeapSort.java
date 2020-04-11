package algos.sorting;

//
public class HeapSort {

    private static int[] sort(int[] input) {
        int length = input.length;
        for(int i = length/2 -1 ; i >= 0 ; i--) {
            heapify(input, i, length);
        }

        for (int i=length-1; i>=0; i--)
        {
            int temp = input[0];
            input[0] = input[i];
            input[i] = temp;

            heapify(input, 0, i);
        }
        return input;
    }

    public static void heapify(int[] arr, int current, int length) {

        int largest = current;
        int left  = 2*current + 1;
        int right = 2*current + 2;

        if(left < length && arr[left] > arr[largest]) {
            largest = left;
        }

        if(right < length && arr[right] > arr[largest]) {
            largest = right;
        }

        if(largest != current) {
            int temp  = arr[current];
            arr[current] = arr[largest];
            arr[largest] = temp;
            heapify(arr, largest, length);
        }
    }


    public static void main(String[] args) {
        int[] input = {5, 7, 3, 12, 11, 2, 1};
        System.out.println(sort(input));
    }
}
