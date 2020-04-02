package corejava.singleton;


import java.io.*;

public class SingletonDriverClass {

    public static void main(String[] args) throws IOException, CloneNotSupportedException {

        /* Driver impl for enum*/
        SingetonEnum singetonEnum = SingetonEnum.INSTANCE;
        System.out.println(singetonEnum.getValue());
        singetonEnum.setValue(2);
        System.out.println(singetonEnum.getValue());


        /* Driver impl for serialization and deserialization*/

        SingletonSerialzation singleton = SingletonSerialzation.getInstance();
        // Serialize
        try {
            FileOutputStream fileOut = new FileOutputStream("out.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(singleton);
            out.close();
            fileOut.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        SingletonSerialzation singleton2 = null;
        try {
            FileInputStream fileIn = new FileInputStream("out.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            singleton2 = (SingletonSerialzation) in.readObject();
            in.close();
            fileIn.close();
        } catch (IOException i) {
            i.printStackTrace();
        } catch (ClassNotFoundException c) {
            System.out.println("singletons.SingletonEnum class not found");
            c.printStackTrace();
        }

        // Driver code for clonning

        SingletonCloning instance1 = SingletonCloning.getInstance();
        SingletonCloning instance2 = (SingletonCloning) instance1.clone();
        System.out.println("instance1 hashCode:- "
                + instance1.hashCode());
        System.out.println("instance2 hashCode:- "
                + instance2.hashCode());

    }
}
