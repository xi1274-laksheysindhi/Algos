package array;

public class SearchA2DMatrix74 {

    static boolean seach2dMatrix(int[][] input, int target) {
        int n = input.length;
        if(n == 0) {
            return false;
        }
        int m = input[0].length;
        if(m == 0) {
            return false;
        }
        for (int i = 0; i < n; i++) {
            if (target >= input[i][0] && target <= input[i][m-1]) {
                return applyBinarySearch(input[i], target, 0, m);
            }
        }
        return false;
    }

    static boolean applyBinarySearch(int[] arr, int target, int start, int end) {
        int middle = (start + end) / 2;
        if(start != end) {
        if (target == arr[middle]) {
            return true;
        }

            if (target > arr[middle]) {
                return applyBinarySearch(arr, target, middle+1, end);
            } else {
                return applyBinarySearch(arr, target, start, middle);
            }
        }
        return false;


    }

    public static void main(String[] args) {

        int[][] arr = {
                {1,   4,  7, 11, 15},
        {2,   5,  8, 12, 19},
    {3,   6,  9, 16, 22},
        {10, 13, 14, 17, 24},
        {18, 21, 23, 26, 30}

        };
        System.out.println(seach2dMatrix(arr, 5));
    }
}
