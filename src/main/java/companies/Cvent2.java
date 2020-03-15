package companies;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class Cvent2 {

    public static List<Integer> getList(List<Integer> list) {
        Map<Integer, List<Integer>> item = new ConcurrentHashMap<>();
        Collections.sort(list);
        List fistList = new ArrayList<>();
        fistList.add(list.get(0));
        item.put(list.get(0), fistList);
        for(int i = 1; i < list.size(); i++) {
            boolean createNew = true;
            for (Map.Entry<Integer, List<Integer>> entry : item.entrySet()) {
                List<Integer> list1 = entry.getValue();
                if (list.get(i) % list1.get(list1.size() -1) == 0) {
                    list1.add(list.get(i));
                    createNew = false;
                }

                if(createNew) {
                    List fistList1 = new ArrayList<>();
                    fistList1.add(list.get(i));
                    item.put(list.get(i), fistList1);
                }

            }
        }

        return null;
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(33);
        list.add(15);
        list.add(20);
        list.add(10);
        getList(list);
    }
}
