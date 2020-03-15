package java8.FunctionalInterface;

import java.util.*;

// In funtional Interface impl Comparator<Integer> integer is input type
class Employee {
    private int rollNo;
    private String name;

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employee(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Employee.class.getSimpleName() + "[", "]")
                .add("rollNo=" + rollNo)
                .add("name='" + name + "'")
                .toString();
    }
}
public class ComparatorImplementationEmployeeObject {

    public static void main(String[] args) {
        List<Employee> empList = new ArrayList<>();
        empList.add(new Employee(7, "Lakshey"));
        empList.add(new Employee(5, "qwerty"));
        empList.add(new Employee(6, "teest"));
        empList.add(new Employee(15, "qazxsw"));
        empList.add(new Employee(10, "zzzz"));
        System.out.println(empList);
        Comparator<Employee> c = (e1,e2) -> e1.getRollNo() > e2.getRollNo() ? 1 : e1.getRollNo() < e2.getRollNo() ? -1 : 0;
        Collections.sort(empList, c);
        System.out.println(empList);



    }

}
