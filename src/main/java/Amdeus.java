import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Amdeus {

    public static void main(String[] args) {
       String[] a = {"a","b","d","a","a","c","b","d","a"};

       findNumbers(a);

    }

    public static Map findNumbers(String[] a) {
        Map<String, Integer> m = new HashMap();
        for(int i = 0 ; i < a.length; i++) {
            if(m.containsKey(a[i])) {
                int count = m.get(a[i]);
                m.put(a[i], count+1);
            } else {
                m.put(a[i], 1);
            }
        }
        return m;
    }
}
