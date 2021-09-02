package companies;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class OpentextFindMax {

    public static void main(String[] args) {

        // List of the numbers to process.
//		List<Integer> list = Arrays.asList(51, 71, 17, 42);
//		List<Integer> list = Arrays.asList(42, 33, 60);
//		List<Integer> list = Arrays.asList(51, 32, 43);

        int[] arr = { 51, 71, 17, 42};
        System.out.println(findMax(arr));



    }

    public static Integer findMax(int[] arr) {
        Map<Integer, List> map = new HashMap<>();
        int maxSum = -1;
        for(int i=0;i<arr.length;++i){
            int temp = arr[i];
            int sum = 0;
            while(temp > 0){
                sum += (temp % 10);
                temp /= 10;
            }
            if(!map.containsKey(sum)){
                map.put(sum, new ArrayList());
                map.get(sum).add(arr[i]);
            }else{

                List<Integer> nums = map.get(sum);

                nums.add(arr[i]);
                Collections.sort(nums);

                maxSum = Math.max(maxSum, nums.get(nums.size()-1)+nums.get(nums.size()-2));
            }
        }

        return maxSum;
    }

}
