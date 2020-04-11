package array;

import java.util.*;

public class SingleNumber136 {
    public static int singleNumber(int[] nums) {
        Set singleSet = new HashSet<>();
        Set multipleSet = new HashSet();
        for(int num : nums) {
            if(multipleSet.contains(num)) {
                continue;
            }
            if(singleSet.contains(num)) {
                multipleSet.add(num);
                singleSet.remove(num);
                continue;
            }
            singleSet.add(num);

        }

return (int) singleSet.iterator().next();

    }

    public static void main(String[] args) {
        int[] arr = {2,2,1, 2};
        singleNumber(arr);
    }
}
