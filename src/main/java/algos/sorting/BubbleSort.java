package algos.sorting;


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
