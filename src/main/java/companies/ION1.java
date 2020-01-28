package companies;

import java.util.Arrays;

public class ION1 {

    public int solution(int[] A) {
        Arrays.sort(A);
        int maxDistance = Integer.MIN_VALUE;
        if (A.length == 2)  {
            return (A[1] - A[0]) / 2;
        }
        for (int i=0; i < A.length - 1; i++) {
            if (A[i+1] - A[i] > 1) {
                maxDistance = Math.max(maxDistance, A[i+1] - A[i]);
            }
        }

        return maxDistance / 2;
    }

    public static void main(String[] args) {
        int[] A = new int[8];
        A[0] = 10;
        A[1] = 0;
        A[2] = 8;
        A[3] = 2;
        A[4] = -1;
        A[5] = 12;
        A[6] = 11;
        A[7] = 3;

        ION1 ion1 = new ION1();
        ion1.solution(A);
    }


}
