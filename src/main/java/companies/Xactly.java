package companies;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Xactly {
    public static void main(String[] args) {

//        int arr[] = {1,2, 3, 3,2 ,5,4};
//        int repeated = 0;
//        Map<int[], Integer> map = new HashMap();
//        Map<int[], Integer> position = new HashMap();
//
//
//        Arrays.asList(arr).forEach(a -> {
//            if(map.containsKey(a)) {
//
//                int val = map.get(a);
//                map.put(a, val+1);
//                position.put(a, )
//                if()
//            } else{
//                map.put(a, 1);
//
//            }
//        });

        List<Integer> l1 = Arrays.asList(1, 1,1 ,1);
        List<Integer> l2 = Arrays.asList(0, 1 , 0, 0);
        List<Integer> l3 = Arrays.asList(0, 0 , 0, 0 );
        List<Integer> l4 = Arrays.asList(1, 0 , 1, 1);




        List<List<Integer>> list = new ArrayList<>();
        list.add(l1);
        list.add(l2);
        list.add(l3);
        list.add(l4);

        list.stream().flatMap(a -> a.stream()).collect(Collectors.toList());







    }
}
