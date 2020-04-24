package array;

import java.util.*;

public class QueriesonaPermutationWithKey1409 {
    public static int[] processQueries(int[] queries, int m) {
        int[] finalArr = new int[queries.length];
        int count =0;
        List arr = new LinkedList();
        for(int i = 1; i<=m; i++) {
            arr.add(i);
        }

        for(int i = 0; i < queries.length; i++) {
            int index = arr.indexOf(queries[i]);
            finalArr[count]  = index;
            arr.remove(index);
            arr.add(0,queries[i]);
            count++;
        }
        return finalArr;
    }

    public static void main(String[] args) {
        int[] queries = {3,1,2,1};
        int m = 5;
        processQueries(queries, m);
    }
}
