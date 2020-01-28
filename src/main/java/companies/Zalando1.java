package companies;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Zalando1 {

    public static int zalandoQuestion(int[] nums) {
        int ans = 0;

        for (int i = 0; i < nums.length; i++)
            for (int j = i+1; j < nums.length; j++)

                if (nums[i] == nums[j])
                    ans++;
        return ans;
    }

    public static void main(String[] args) {
        int nums[] = {3, 5, 6, 3, 3, 5};
        System.out.println(zalandoQuestion(nums));
    }
}
