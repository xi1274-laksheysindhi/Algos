package companies;

import java.util.ArrayList;
import java.util.List;

public class Fedility1 {

    /* Utility Functions to get max and minimum of two integers */
    static int max(int x, int y)
    {
        return x > y ? x : y;
    }

    static int min(int x, int y)
    {
        return x < y ? x : y;
    }

    /* For a given array arr[], returns the maximum j-i such that
    arr[j] > arr[i] */
    static int maxIndexDiff(List<Integer> arr)
    {
       int maxDiff = 0;

       for(int i = 1;  i <  arr.size(); i++) {
           for(int j =0; j < i;j++) {
               if(arr.get(i) > arr.get(j)) {
                   if(maxDiff < arr.get(i)-arr.get(j)) {
                       maxDiff = arr.get(i)-arr.get(j);
                   }
               }
           }
       }

        return maxDiff;
    }

    /* Driver program to test above functions */
    public static void main(String[] args)
    {
        List<Integer> l = new ArrayList();
        l.add(5);
        l.add(10);
        l.add(8);
        l.add(7);
        l.add(6);
        l.add(5);
       // l.add(8);
        //l.add(1);







        int maxDiff = maxIndexDiff(l);
        System.out.println(maxDiff);
    }
}
