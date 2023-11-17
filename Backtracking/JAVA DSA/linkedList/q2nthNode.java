/*Finding nth Node from the end of Linked LIST. head is given */

public class q2nthNode {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static Node nthNode(Node head, int n) {
        int size = 0;
        Node temp = head;
        while (temp != null) {
            size++;
            temp = temp.next;
        }
        temp = head;
        int m = size - n ;
        for (int i = 1; i <= m ; i++) {
            temp = temp.next; 
        }
        return temp;
    }

    public static void main(String[] args) {
        Node a = new Node(54);
        Node b = new Node(7);
        Node c = new Node(65);
        Node k = new Node(14);
        Node d = new Node(7);
        Node e = new Node(16);
        a.next = b;
        b.next = c;
        c.next = k;
        k.next = d;
        d.next = e;

        Node q = nthNode(a, 2);

        System.out.println(q.data);

    }
}


