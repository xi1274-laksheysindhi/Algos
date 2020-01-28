/******************************************************************************

 Online Java Compiler.
 Code, Compile, Run and Debug java program online.
 Write your code in this editor and press "Run" button to execute it.

 *******************************************************************************/
import java.util.*;


public class CamelCaseToSnakeCase
{
    public static void main(String[] args) {
        String s = "class_name";
        String so = null;
        if(s.contains("_")) {
            while(s.contains("_") == true) {
                int index = s.indexOf("_");
                s = s.replaceFirst("_","");
                char[] ch = s.toCharArray();
                Character c   = new Character(ch[index]);
                ch[index] = c.toUpperCase(ch[index]);
                s = new String(ch);
            }
            System.out.println(s);
        } else {
            char[] ch = s.toCharArray();
            List cc = Arrays.asList(ch);

            for(int i = 0; i < s.length(); i++) {
                Character z = new Character(ch[i]);
                Boolean c = new Character(ch[i]).isUpperCase(ch[i]);
                if(c) {
                    if(so ==null) {
                        so = s.replace(z.toString(),"_"+z.toString().toLowerCase());

                    } else {
                        so = so.replace(z.toString(),"_"+z.toString().toLowerCase());
                    }
                }

            }
            System.out.println(so);

        }

    }
}
