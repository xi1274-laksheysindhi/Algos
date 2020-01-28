package companies;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;
import java.util.regex.Pattern;

public class PropertyGuru {

    public static final int MAX = 0xFFFFF;
    public static final int MIN = 0;
    private static final Pattern NUMERIC = Pattern.compile("\\d+");
    private static final Stack<Integer> stack = new Stack<>();
    private static final Map<String, Runnable> OPERATIONS = new HashMap<>();

    static {
        OPERATIONS.put("POP", PropertyGuru::pop);
        OPERATIONS.put("DUP", PropertyGuru::dup);
        OPERATIONS.put("+", PropertyGuru::add);
        OPERATIONS.put("-", PropertyGuru::sub);
    }

    public static int solution(String S) {
        try {
            Arrays.stream(S.split(" ")).forEach(s -> applyCommand(s));
            return pop();
        } catch (IllegalArgumentException e) {
            return -1;
        }
    }

    private static void applyCommand(String s) {
        if (NUMERIC.matcher(s).matches()) {
            push(Integer.valueOf(s));
        } else {
            OPERATIONS.get(s).run();
        }
    }

    private static void push(int i) {
        withinRange(i);
        stack.push(i);
    }

    private static int pop() {
        return stack.pop();
    }

    private static void dup() {
        hasElements(1);
        push(stack.peek());
    }

    private static void add() {
        hasElements(2);
        push(stack.pop() + stack.pop());
    }

    private static void sub() {
        hasElements(2);
        push(stack.pop() - stack.pop());
    }

    private static int hasElements(int i) {
        if(stack.size() < i){
            throw new IllegalArgumentException("Too few elements available");
        }
        return i;
    }

    private static int withinRange(int i){
        if(i < MIN || i > MAX){
            throw new IllegalArgumentException("Input under/overflow");
        }
        return i;
    }

    public static void main(String[] args) {
        String s = "5 6 + -";
        System.out.println(solution(s));
    }
}
