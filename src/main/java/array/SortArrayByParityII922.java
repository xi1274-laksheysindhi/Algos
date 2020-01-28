package array;

import java.util.ArrayList;
import java.util.List;

public class SortArrayByParityII922 {
    public static int[] sortArrayByParity(int[]  A) {

        int[] newArr = new int[A.length];
        int oddCount = 1;
        int evenCount = 0;
        for(int i = 0; i < A.length; i++) {
            if(A[i] % 2 == 0) {
                newArr[evenCount] = A[i];
                evenCount = evenCount+2;
            } else {

                newArr[oddCount] = A[i];
                oddCount =  oddCount + 2;
            }
        }
        return newArr;
    }

    public static void main(String[] args) {
        int[] i = {4,2,5,7};

        System.out.println(sortArrayByParity(i));
    }
}
