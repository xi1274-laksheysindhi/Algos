package udemycourse;

// binary search is for sorted array
public class BinarySearch {

    public static int binarySearch(int[] input, int low, int high, int item) {

        int mid = (low+high)/2;
        if(low == high) {
            return -1;
        }
        if(item == input[mid]) {
            return mid;
        }

        if(item < input[mid]) {
           return binarySearch(input, low, mid-1, item);
        }

        if(item > input[mid]) {
            return binarySearch(input, mid+1, high, item);
        }

        return -1;

    }

    public static void main(String[] args) {
            int[] arr = {-5, -2, 1, 5, 7 , 10, 11,17};
        binarySearch(arr, 0, arr.length-1, -3);
    }
}
