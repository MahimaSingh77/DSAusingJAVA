public class middleNode {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;

        }

    }

    public static void middleElement(Node head) {
        Node temp = head;
        int n = 0;

        while (temp != null) {
            temp = temp.next;
            n++;
        }
        temp = head;

        if (n % 2 == 0) {
            for (int i = 1; i <= n / 2; i++) {
                temp = temp.next;
            }
        } else {
            for (int i = 1; i < (n / 2) + 1; i++) {
                temp = temp.next;
            }

        }
        System.out.println(temp.data);
    }

    public static void main(String[] args) {
        Node a = new Node(5);
        Node b = new Node(3);
        Node c = new Node(9);
        Node d = new Node(8);
        Node e = new Node(16);
        Node f = new Node(416);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;

        middleElement(a);

    }
}
