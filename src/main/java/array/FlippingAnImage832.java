package array;

public class FlippingAnImage832 {

    public static int[][] flippingAnImage(int[][]  A) {
        int[][] newArr = new int[A.length][A[0].length];
        for(int i = 0; i < A.length; i++) {
            int[] temp = new int[A[i].length];
            for(int j = A[i].length-1; j >= 0 ; j--) {
                 int tempVal = A[i][j];

                temp[A[i].length-1 - j] = (tempVal == 1 ? 0 : 1);
            }
            newArr[i] = temp;
        }
        return newArr;
    }

    public static void main(String[] args) {
        int[][] i = {{1}};

        System.out.println(flippingAnImage(i));
    }
}
