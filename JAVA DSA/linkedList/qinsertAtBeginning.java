public class qinsertAtBeginning {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;

        }
    }
    public static class linkedlist{
        Node head = null;
        Node tail = null;

        void insertAtBeginning(int val){
            Node temp = new Node(val);
            if(head == null){
                head = tail = temp;
            }
            else{
                temp.next = head;
                head = temp;
            }
            
        }

        void display(){
            Node temp = head;
            while(temp != null){
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }
    }
    public static void main(String[] args) {
        linkedlist ll = new linkedlist();
        ll.insertAtBeginning(3);
        ll.insertAtBeginning(2);
        ll.insertAtBeginning(8);
        ll.display();


    }
}
