package array;

import java.util.HashSet;
import java.util.Set;

public class ThirdMaximumNumber414 {
    static int thirdMax(int a[]) {
        // Your code here

        int first = a[0];

        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;
        Set<Integer> s= new HashSet();
        s.add(a[0]);
        for(int i=1; i < a.length; i++) {
            s.add(a[i]);
            if(first <= a[i]) {
                if(first == a[i]) {
                    continue;
                }
                third = second;
                second = first;
                first = a[i];

            } else if(second <= a[i]) {

                if(second == a[i]) {
                    continue;
                }
                third = second;
                second = a[i];

            } else if(third <= a[i]) {
                if(third == a[i]) {
                    continue;
                }
                third = a[i];
            }
        }

        if(s.size() < 3) {
            return first;
        }

        return  s.contains(third) ? third : s.contains(first) ? first : second;
    }

    public static void main(String[] args) {
        int[] ar = {1,2, -2147483648};
        thirdMax(ar);
    }
}
