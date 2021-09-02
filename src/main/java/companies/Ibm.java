package companies;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Ibm {


    public static boolean identifyIfPalindrome(Integer tempString) {
            int divider = 10;
            List<Integer> list = new ArrayList<>();
            while(tempString != 1) {
                tempString = tempString / divider;
                list.add(tempString%divider);
            }

       return  list.stream().noneMatch(i -> list.get(i) != list.get(list.size() -i -1));


    }

    public static void main(String[] args) {
        Integer num = new Integer(12324);
        identifyIfPalindrome(num);
    }
}
