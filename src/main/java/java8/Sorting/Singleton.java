package java8.Sorting;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;



public class Singleton {


    public static void main(String[] args) {
        int[] arr = {2, 3, 6, 4, 9, 0, 11};
        int sumRequired = 9;
        int sum;
        int index;
        int count = 0;

        for(int i = 0; i < arr.length; i++) {
            sum = arr[i];
            for(int j = i+1; j < arr.length; j++) {
               if (count < arr.length) {
                   index = j % arr.length;
                   sum = sum + arr[index];
                   count++;
               }
            }
            count =0;
        }







    }
}
