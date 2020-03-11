package corejava.immutability;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//1 - Dont provide any methods that modify object's state
//2 - Ensure class cant be extended -->this prevents careless subclasses
// like in case if child class override parent class's getter to return some other value
//3 - Make all fields as final
//4 -  Make all fields as private
// in case of strings it is ok but in case of modificable or programmer made Class objects used
// developer needs to handle it himself
// like in In this IMMUTABLE CLASS we have ADDRESS class referred and object of address class is modificable
// then Immutable class wont be immutable
// Same goes for the collections Array list and all.
// in case of class if class is not made final then if class is extended by some child class is could override its method and change its functionality
final public class ImmutableClass  {

    private final String name;

    private final List<String> cars;

    private final Address address;

    public ImmutableClass(String name, List<String> cars, Address address) {
        this.name = name;
        this.cars = cars;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public List<String> getCars() {
        // done to keep immutable behavior of object
        return Collections.unmodifiableList(cars);
    }

    public Address getAddress() throws CloneNotSupportedException {
        // clone of addresss object is returned  not the same object
        // in case programmer tries to append it he is not able to as changes are made in clonned object.
        return address.clone();
    }

    public static void main(String[] args) throws CloneNotSupportedException {

        List l = new ArrayList();

        l.add("santro");
        l.add("swift");
        l.add("creta");
        l.add("city");

        ImmutableClass i = new ImmutableClass("lakshey", l, new Address("qwerty", "qwerty"));
        System.out.println(i.getAddress().getName());
        System.out.println(i.getAddress().getStreetName());

        // Immutability destroyed.... since we have made it ImmutableClass immutable but address is mutable
        List cars = i.getCars();
        cars.add("hundayi");
        System.out.println(l.get(4));

        // Immutability destroyed.... since we have made it ImmutableClass immutable but address is mutable
        Address add = i.getAddress();
        add.setName("sindhi");
        add.setStreetName("sindhi");
        System.out.println(i.getAddress().getName());
        System.out.println(i.getAddress().getStreetName());

        // to take care of immutablilty we need to deep clone the object and for list we need to use unmodified list





    }
}


class Address implements Cloneable{

    private String name;
    private String streetName;

    public Address(String name, String streetName) {
        this.name = name;
        this.streetName = streetName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    @Override
    protected Address clone() throws CloneNotSupportedException {
        return (Address) super.clone();
    }
}