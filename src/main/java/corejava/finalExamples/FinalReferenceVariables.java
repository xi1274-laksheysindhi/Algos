package corejava.finalExamples;

public class FinalReferenceVariables {

    public static void main(String[] args) {
        // reassignment of reference variable cannot be done but we can perform updating object
        //internal state of the object pointed by that reference variable can be changed.
        // THIS PROPERTY IS CALLED non-transitivity property
        // SAME GOES FOR ALL OBJECTS INCLUDING ARRAYS
        final StringBuilder stringBuilder = new StringBuilder("lakshey");
        stringBuilder.append("sindhi");
        System.out.println(stringBuilder);
        // it wont work for reference variable reassignment is not possible
        //stringBuilder = new StringBuilder("sachin");
    }


}
