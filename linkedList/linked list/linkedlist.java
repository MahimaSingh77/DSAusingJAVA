import java.util.*;

class linkedlist {
    Node head;
    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }

    }

    // add - first
    public void addFirst(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    public void addLast(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        Node currNode = head;

        while (currNode.next != null) {
            currNode = currNode.next;

        }

        currNode.next = newNode;
    }

    public void printList() {
        if (head == null) {
            System.out.println("list is empty");
            return;
        }
        Node currNode = head;
        while (currNode != null) {
            currNode = currNode.next;

        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        linkedlist list = new linkedlist();
        list.addFirst("a");
        list.addFirst("is");
        list.printList();
        
        list.addLast("last");
        list.printList();

        list.addLast("this");
        list.printList();

    }
}