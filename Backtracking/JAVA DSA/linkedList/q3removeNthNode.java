/*Removing nth Node from the end of Linked List in One traversal */

public class q3removeNthNode {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static void removeNode(Node head, int n) {
        Node slow = head;
        Node fast = head;
        for (int i = 1; i <= n; i++) {
            fast = fast.next;
        }
        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }

        slow.data = slow.next.data;
        slow.next = slow.next.next;

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

        removeNode(a, 2);
        Node temp = a;
        while (temp != null) {
            System.out.println(temp.data + " ");
            temp = temp.next;
        }
    }
}




/*Removing head Node Linked List in One traversal */
/* 
public class q3removeNthNode {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static Node removeNode(Node head, int n) {
        Node slow = head;
        Node fast = head;
        for (int i = 1; i <= n; i++) {
            fast = fast.next;
        }
        if(fast==null){
            head=head.next;
            return head; 
        }
        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }

        slow.data = slow.next.data;
        slow.next = slow.next.next;
        return head;

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

        a = removeNode(a, 6);
        Node temp = a;
        while (temp != null) {
            System.out.println(temp.data + " ");
            temp = temp.next;
        }
    }
} 
*/