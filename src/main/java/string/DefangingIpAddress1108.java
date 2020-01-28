package string;

public class DefangingIpAddress1108 {

    public static String defangIPaddr(String address) {
        address = address.replace(".", "[.]");
        return address;
    }

    public static void main(String[] args) {
        String address = "1.1.1.1";
        address = defangIPaddr(address);
        System.out.println(address);
    }

}
