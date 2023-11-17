public class qinsertAtGivenIndex {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;

        }
    }

    public static class linkedlist {
        Node head = null;
        Node tail = null;

        void insertAt(int idx , int val) {
            Node temp = new Node(val);
            Node t = head;
            for(int i=0 ; i <= idx-1; i++){
                t = t.next;
            }
            t.next = temp;
            // t= t.next;
            // temp.next = t;
        }

        void display() {
            Node temp = head;
            while (temp != null) {
                System.out.println(temp.data + " ");
                temp = temp.next;

            }
        }

        public static void main(String[] args) {
            linkedlist ll = new linkedlist();
            ll.insertAt(2 , 243);
            ll.display();

        }
    }
}
