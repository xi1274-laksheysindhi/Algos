package string;

import java.util.HashSet;
import java.util.Set;

public class UniqueEmailAddresses929 {

    public static Set uniqueEmailAddresses(String[] address) {
        Set<String> set = new HashSet<>();
        for(String addresss : address) {
            String domain[] = addresss.split("@");
            String s = domain[0];
            s = s.replace(".", "");
            s = (s.indexOf("+") >= 0 ? s.substring(0, s.indexOf("+")) : s);
            set.add(s.concat("@"+domain[1]));
        }

        return set;
    }

    public static void main(String[] args) {
        String[] addresses = {"test.email+alex@leetcode.com","test.email.leet+alex@code.com"};
        System.out.println(uniqueEmailAddresses(addresses).size());
    }


}
