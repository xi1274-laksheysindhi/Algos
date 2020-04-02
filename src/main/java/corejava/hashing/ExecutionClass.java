package corejava.hashing;

public class ExecutionClass {

    public static void main(String[] args) {

        // equals and hash code
         EqualsAndHashCode equalsAndHashCode1 = new EqualsAndHashCode(1, "lakshey");
        System.out.println(equalsAndHashCode1.hashCode());
        EqualsAndHashCode equalsAndHashCode2 = new EqualsAndHashCode(2, "sindhi");
        System.out.println(equalsAndHashCode2.hashCode());

        System.out.println(equalsAndHashCode1.equals(equalsAndHashCode2));




    }
}
