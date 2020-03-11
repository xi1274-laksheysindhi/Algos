package companies;
 class o extends Exception {


}

 class z extends o {

 }
public class A  {

public static void main(String[] args) {
    try {

        throw new z();
    } catch (Exception e) {

    }
}
}


