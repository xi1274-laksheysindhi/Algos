package companies;

import java.util.LinkedList;


// Josephus problem
public class Citius {

    static int josephus(int n, int k) {
        LinkedList<Integer> queue = new LinkedList();
        for (int i = 1; i <= n; i++) {
            queue.add(i);
        }
        while (queue.size() != 1) {
            queue.remove(k);
            k = k + 1;
            if (k - queue.size() >= 0) {
                k = k - queue.size();
            }
        }

        return queue.get(0);
    }


    public static void main(String[] args) {
        int n = 5;
        int k = 1;
        System.out.println("The chosen place is " + josephus(n, k));
    }
}
