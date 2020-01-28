/*
package ds;

public class LinkedList<T> {
    private Node head;
    private Node trunk;
    private int count;

    class Node {
        Node next;
        T value;

        Node(T value) {
            this.value = value;
        }
    }

    public boolean add(T value) {
        Node node = new Node(value);
        if (head == null) {
            this.head = node;
            this.trunk = node;
            count++;
            return true;
        }
        trunk.next = node;
        trunk = node;
        count++;
        return true;

    }

    public int getCount() {
        return count;
    }

    public void remove() {
        unlink(1);
    }

    private T unlink(int index) {

    }

    public void remove(int index) {
        unlink(index);
    }

    private Node node() {
        for (int i =) ;
    }

    public void printAll() {
        Node node = head;
        while (node != null) {
            if (head != null) {
                System.out.println(node.value);
                node = node.next;
            }
        }
    }


}
*/
