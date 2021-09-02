package java8.Sorting;

import java8.Sorting.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortingMain {

    public static void main(String[] args) {


        SortingMain s = new SortingMain();

        s.sorting();
    }

    public void sorting() {
        List<Student> list = new ArrayList();
        list.add(new Student(3, "Lakshey", "IT"));
        list.add(new Student(7, "Test", "IT"));
        list.add(new Student(2, "QWERTY", "STUDENT"));
        list.add(new Student(11, "QAZXSW", "IT"));
        list.add(new Student(9, "QKAKAK", "IT"));
        list.add(new Student(21, null, "IT"));
        list.add(new Student(22, "B", "IT"));
        list.add(new Student(22, "A", "IT"));
        int [] arr = {1,2,2,3,4,1,3,7,5};
        String[] s = {"lakshey", "sindhi", "akshay"};
        Arrays.stream(arr).sorted().forEach(a-> System.out.println(a));


        Arrays.stream(s).sorted(Comparator.reverseOrder()).collect(Collectors.toList());

        Comparator<Student> comparator = Comparator.comparing(Student::getRollNo).reversed().thenComparing(Student::getName).reversed();
       list.stream().sorted(comparator).collect(Collectors.toList());
       //for reversed
       list.stream().sorted(comparator.reversed()).collect(Collectors.toList());

       Comparator<Student> comparatorForNull = Comparator.comparing(Student::getName, Comparator.nullsFirst(Comparator.naturalOrder()));

       list.sort(Comparator.nullsFirst(comparatorForNull));

        list.stream().sorted(Comparator.nullsFirst(comparatorForNull)).collect(Collectors.toList());

    }
}