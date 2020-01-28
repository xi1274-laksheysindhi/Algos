package companies;

import java.util.PriorityQueue;

public class NIIT1 {

    public static void main(String[] args) {
        PriorityQueue p = new PriorityQueue();
        p.add("d");
        p.add("l");
        p.add("b");
        p.offer("b");

        System.out.println(p.size() +" " + p.poll());
        System.out.println(" "+p.peek() +"" + p.poll());
        System.out.println(p.poll() +"" + p.poll());
    }
}
