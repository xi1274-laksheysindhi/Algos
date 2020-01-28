package array;

public class SortArrayByParity905 {

    public static int[] sortArrayByParity(int[]  A) {
        int[] newArr = new int[A.length];
       int oddCount = 0;
        int evenCount = 0;
       for(int i = 0; i < A.length; i++) {
           if(A[i] % 2 == 0) {
               newArr[evenCount] = A[i];
               evenCount++;
           } else {
               oddCount = (oddCount == 0) ? A.length-1 : oddCount -1;
               newArr[oddCount] = A[i];
           }
       }
        return newArr;
    }

    public static void main(String[] args) {
        int[] i = {3,1,2,4};

        System.out.println(sortArrayByParity(i));
    }
}
