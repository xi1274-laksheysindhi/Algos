package java8.FunctionalInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// Comparator functional interface implementation  to sort accordingly
public class ComparatorImplementation {

    public static void main(String[] args) {
        List<Integer> al = new ArrayList();
        al.add(20);
        al.add(30);
        al.add(5);
        al.add(3);
        al.add(50);
        System.out.println(al);
        Comparator<Integer> c = (i1, i2) -> i1 > i2 ? 1 : i1 < i2 ? -1 :0;
        Collections.sort(al, c);
        System.out.println(al);
    }
}
