/*Delete Node in a Linked List */
public class q1deleteNode {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;

        }

    }

    public static void deleteNode(Node node) {
        node.data = node.next.data;
        node.next = node.next.next;

    }

    public static void main(String[] args) {
        Node a = new Node(5);
        Node b = new Node(3);
        Node c = new Node(9);
        Node k = new Node(100);
        Node d = new Node(8);
        Node e = new Node(16);
        a.next = b;
        b.next = c;
        c.next = k;
        k.next = d;
        d.next = e;

        deleteNode(e);

        Node head = a;
        while (head != null) {

            System.out.print(head.data + " ");
            head = head.next;
        }
    }

}
