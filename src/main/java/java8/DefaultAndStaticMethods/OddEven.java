package java8.DefaultAndStaticMethods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class OddEven {

    public static void main(String[] args) {
       Integer[] arr = {2,8,99, 3, 88, 34, 67, 23, 22, 35, 23 ,4, 54, 67};

        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        Arrays.sort(arr, Collections.reverseOrder());
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }


}
