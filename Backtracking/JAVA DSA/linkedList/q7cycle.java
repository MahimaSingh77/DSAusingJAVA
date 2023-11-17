public class q7cycle {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;

        }

    }

    public static boolean cycle(Node head) {
        if (head.next == null) {
            return false;
        }

        Node slow = head;
        Node fast = head;
        while (fast != null) {
            if (slow == null) {
                return false;
            }
            slow = slow.next;
            fast = fast.next.next;

            if (fast == slow)
                return true;

        }
        return false;

    }

    public static void main(String[] args) {
        Node a = new Node(3);
        Node b = new Node(2);
        Node c = new Node(0);
        Node d = new Node(-4);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = b;

        boolean bool = cycle(a);
        System.out.println(bool);

    }
}
