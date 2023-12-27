/*Finding intersection of two linked list */

public class q4intersectionOfTwoLL {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static void intersection(Node a1, Node a2) {
        Node temp1 = a1;
        Node temp2 = a2;
        int m = 0;
        int n = 0;
        while (temp1 != null) {
            temp1 = temp1.next;
            m++;
        }
        while (temp2 != null) {

            temp2 = temp2.next;
            n++;

        }
        temp1 = a1;
        temp2 = a2;
        if (m > n) {
            for (int i = 1; i <= m - n; i++) {
                temp1 = temp1.next;
            }
        } else {
            for (int i = 1; i <= n - m; i++) {
                temp2 = temp2.next;
            }
        }
        while (temp1 != temp2) {
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        System.out.println(temp1.data);
    }

    public static void main(String[] args) {
        Node a1 = new Node(100);
        Node b1 = new Node(13);
        Node c1 = new Node(4);

        Node d = new Node(5);
        Node e = new Node(12);
        Node f = new Node(10);

        Node a2 = new Node(90);
        Node b2 = new Node(90);

        a1.next = b1;
        b1.next = c1;
        c1.next = d;
        d.next = e;
        e.next = f;

        a2.next = b2;
        b2.next = d;

        intersection(a1, a2);

    }
}