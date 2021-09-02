package companies;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class Employee {
    String name;
    int age;
    List<String> sportsActivity;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<String> getSportsActivity() {
        return sportsActivity;
    }

    public void setSportsActivity(List<String> sportsActivity) {
        this.sportsActivity = sportsActivity;
    }

    public Employee(String name, int age, List<String> sportsActivity) {
        this.name = name;
        this.age = age;
        this.sportsActivity = sportsActivity;
    }
    public static void main(String[] args) {
        List<Employee> employees =new ArrayList<>();

        employees.add(new Employee("Lakshey", 28, Arrays.asList("Criclet", "FootBall")));
        employees.add(new Employee("Alshay", 28,  Arrays.asList("Criclet", "Swimming")));
        employees.add(new Employee("Alshay", 28, Arrays.asList("Football, Cricket")));


        employees.stream().flatMap(e -> e.getSportsActivity().stream()).filter(z -> z.equalsIgnoreCase("FootBall")).collect(Collectors.toList());

    }

}
