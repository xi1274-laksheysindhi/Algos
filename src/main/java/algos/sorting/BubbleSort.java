package algos.sorting;


/*
Worst and Average Case Time Complexity: O(n*n). Worst case occurs when array is reverse sorted.

Best Case Time Complexity: O(n). Best case occurs when array is already sorted.

Auxiliary Space: O(1)

Boundary Cases: Bubble sort takes minimum time (Order of n) when elements are already sorted.
 */
public class BubbleSort {
    private static int[] sort(int[] input) {
        for (int j = 0; j < input.length; j++) {
            for (int i = 0; i < input.length-j-1; i++) {
                if (input[i] > input[i + 1]) {
                    int temp = input[i];
                    input[i] = input[i + 1];
                    input[i + 1] = temp;
                }
            }
        }
        return input;
    }


    public static void main(String[] args) {
        int[] input = {5, 7, 3, 12, 11, 2, 1};
        System.out.println(sort(input));
    }
}
