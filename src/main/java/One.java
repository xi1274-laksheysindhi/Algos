public class One {

    public void one(int s) {
        System.out.println("String"+s);
    }


    public void one(Object s) {
        System.out.println("Object"+s);
    }
    public static void main(String[] args) {
        One o = new One();
        o.one(1);
        o.one(2);
    }
}
