package companies;

import java.util.ArrayDeque;
import java.util.Deque;

public class FIS {

    // A utility function to check
    // whether a password is valid or not
    public static int isValid(String expr) {
        Deque<Character> stack
                = new ArrayDeque<>();
        int count = 0;
        for (int i = 0; i < expr.length(); i++) {
            char x = expr.charAt(i);

            if (x == '{') {
                stack.push(x);
                continue;
            }



            char check;

            if (x == '}') {
                if(!stack.isEmpty()) {
                    check = stack.pop();
                    if (check == '{') {
                        count++;
                    }
                }
            }
       }
        return  count;
    }

    // Driver code
    public static void main(String[] args)
    {

        String password1 = "}this}is}valid{";
        isValid(password1);

    }
}