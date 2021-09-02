package array;

public class FindMinimuminRotatedSortedArray153 {

    public static int findMin(int[] arr) {
        int low =0;
        int high = arr.length-1;
        while(low < high)
        {
            int mid = low + (high - low) / 2;
            if (arr[mid] == arr[high])
                high--;

            else if(arr[mid] > arr[high])
                low = mid + 1;
            else
                high = mid;
        }
        return arr[high];
    }

    public static void main(String[] args) {
        int[] arr = {3,4,5,1,2};
        findMin(arr);
    }
}
