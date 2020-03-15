package algos.search;

public class BinarySearch {
    private static int search(int[] input, int element, int start, int end) {
        int mid = (start + end) / 2;
        if (start != end) {
            if (input[mid] == element) {
                return mid;
            }
            if (element < input[mid]) {
                return search(input, element, start, mid - 1);
            }


            return search(input, element, mid + 1, end);
        }
        return -1;




    }


    public static void main(String[] args) {
        int[] input = {3, 7, 11, 17, 22, 37, 46};
        int toSearch = 37;
        int length = input.length;
        System.out.println(search(input, toSearch, 0, length));
    }
}
