
public class basicSyntax{
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            
        }

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
         
        System.out.println(a);
        System.out.println(a.next);
        System.out.println(b);
        System.out.println(a.data);
        System.out.println(b.data);

        Node temp = a;
        while(temp!=null){
            System.out.println(temp.data);
            temp = temp.next;
        }
        
    }
}