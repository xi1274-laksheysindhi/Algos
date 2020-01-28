package array;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class RelativeSortArray1122 {
    public static int[] relativeSortArray1122(int[] arr1, int[] arr2) {
        Map<Integer, Integer> map = new LinkedHashMap<>();
        int[] arrFinal = new int[arr1.length];
        int index = 0;
        for(int i = 0; i < arr1.length; i++) {
            if(map.get(arr1[i]) != null) {
                map.put(arr1[i], map.get(arr1[i])+1);
            } else {
                map.put(arr1[i], 1);
            }
        }

        for(int i = 0; i < arr2.length; i++) {
            if(map.containsKey(arr2[i])) {
              for(int j = 0; j < map.get(arr2[i]) ; j++) {
                  arrFinal[index] = arr2[i];
                  index++;
              }
                map.remove(arr2[i]);
            }
        }

        Map<Integer, Integer> treeMap = new TreeMap<Integer, Integer>(map);
        for (Map.Entry<Integer,Integer> entry : treeMap.entrySet()) {
            for(int j = 0; j < entry.getValue() ; j++) {
                arrFinal[index] = entry.getKey();
                index++;
            }
            map.put(entry.getKey(),0);
        }

        return arrFinal;
    }

    public static void main(String[] args) {
        int[] arr1 = {28,6,22,8,44,17};
        int[] arr2 = {22,28,8,6};
        System.out.println(relativeSortArray1122(arr1, arr2));
    }
}
