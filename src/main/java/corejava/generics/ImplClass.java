package corejava.generics;

import java.util.ArrayList;
import java.util.List;

public class ImplClass {

    // Generic type works with reference classes and wrapper classes
    public static void main(String[] args) {
        GenericClass<String, String, Integer> genericClass = new GenericClass();
        String name = "Lakshey";
        int id = 1;
        boolean qualified= true;
// Type safety is taken care by generics as we have decided at class level
       // genericClass.setT(name);
        //genericClass.setU(id);
        //genericClass.setX(qualified);

 // code reuse here same method can take different type of inputs
        genericClass.genericMethod(name);
        genericClass.genericMethod(id);
        genericClass.genericMethod(qualified);
        genericClass.genericMethod(name, id);

 //Individual Type Casting is not needed: If we do not use generics, then, in the above example every-time we retrieve data from ArrayList,
        // we have to typecast it. Typecasting at every retrieval operation is a big headache.
        // If we already know that our list only holds string data then we need not to typecast it every time.
    List list = new ArrayList();
    list.add(1);
    list.add(2);
    // so i need to cast here that wont be required if i make it with type
    Integer value = (Integer) list.get(0);

    }


}
