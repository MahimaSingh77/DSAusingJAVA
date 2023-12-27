public class reverseDisplay {
    public static class Node{
        int data;
        Node next;
        
        Node(int data){
            this.data = data;
            
        }

    }
// displaying linked list
    public static void display(Node head){
        while(head != null){
            
            System.out.print(head.data + " ");
            head = head.next;
        }
    }
   
//displaying linked list using recursion

public static void displayr(Node head){
    if(head == null) return;
    
    System.out.print(head.data  + " ");
    displayr(head.next);
}
public static void displayreverse(Node head){
    if(head == null) return;
    displayreverse(head.next);
    System.out.print(head.data  + " ");
    
}
    public static void main(String[] args) {
       Node a = new Node(3);
       Node b = new Node(5);
       Node c = new Node(6);
       Node d = new Node(15);

       a.next = b;
       b.next = c;
       c.next = d;
        System.out.println("using loop ");
       display(a);
       System.out.println();
       System.out.println("using recursion ");
       displayr(a);
       System.out.println();
       System.out.println("display reverse using recursion ");
       displayreverse(a);

    }
}
