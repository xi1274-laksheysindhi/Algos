package string;

import java.util.HashMap;
import java.util.Map;

public class RobotReturnToOrigin657 {

    public static boolean robotReturnToOrigin(String string) {
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        for(int i = 0 ; i < string.length(); i++) {
            map.compute(string.charAt(i), (k, v) -> v == null ? 1 : v+1 );
        }
        if((map.getOrDefault("U".charAt(0), 0) - map.getOrDefault("D".charAt(0), 0)) == 0 && (map.getOrDefault("R".charAt(0), 0) - map.getOrDefault("L".charAt(0), 0)) == 0) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String address = "UD";
        System.out.println(robotReturnToOrigin(address));
    }

}
