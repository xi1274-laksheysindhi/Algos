package string;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UniqueMorseCodeWords804 {
    public static int uniqueMorseCodeWords(String[] strings) {
            String s = ".-\",\"-...\",\"-.-.\",\"-..\",\".\",\"..-.\",\"--.\",\"....\",\"..\",\".---\",\"-.-\",\".-..\",\"--\",\"-.\",\"---\",\".--.\",\"--.-\",\".-.\",\"...\",\"-\",\"..-\",\"...-\",\".--\",\"-..-\",\"-.--\",\"--..";
            String[] arr = s.split("\",\"");
            String[] arr2 = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
            Map<String, String>  map =new HashMap();
            Set<String> so = new HashSet<String>();
            for (int i= 0; i <= 25; i++) {
                map.put(arr2[i], arr[i]);

            }

            for(int i = 0; i < strings.length ; i++ ) {
                String codedString = "";
                for(int z = 0 ; z < strings[i].length(); z++) {
                    codedString = codedString+map.get(Character.toString(strings[i].toUpperCase().charAt(z)));
                }
                so.add(codedString);
            }
            return so.size();
    }

    public static void main(String[] args) {
        String words[] = {"gin", "zen", "gig", "msg"};

        System.out.println(uniqueMorseCodeWords(words));
    }
}
