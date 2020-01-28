package companies;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GS1 {

    public static String gsQuestion(int[] nums) {
       List<String> eligibleList = new ArrayList();
        for(int i = 0; i < nums.length; i++) {
           String stringFormat = Integer.toString(nums[i]);
           if(stringFormat.contains("1")
                   && stringFormat.contains("2")
                   && stringFormat.contains("3")) {
               eligibleList.add(stringFormat);

           }
       }
        if(eligibleList.size() == 0) {
            return "-1";
        }

        Collections.sort(eligibleList);
        return String.join(",", eligibleList);

    }

    public static void main(String[] args) {
        int nums[] = {1456, 345671, 4318, 23};
        System.out.println(gsQuestion(nums));
    }
}
