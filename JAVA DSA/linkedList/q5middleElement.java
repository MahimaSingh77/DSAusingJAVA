// public class q5middleElement {
//     public static class Node {
//         int data;
//         Node next;

//         Node(int data) {
//             this.data = data;

//         }

//     }
//     public static void middleElement(Node head){
//         Node temp = head;
//         int n = 0;
        
//         while (temp != null) {
//             temp = temp.next;
//             n++;
//         }
//         temp = head;
        
//         if(n%2==0){
//             for(int i=1; i<n/2; i++){
//                 temp =temp.next;
//             }
//         }
//         else{
//             for(int i=1; i<(n/2)+1; i++){
//                 temp =temp.next;
//             }

//         }
//         System.out.println(temp.data);
//     }

//     public static void main(String[] args) {
//         Node a = new Node(5);
//         Node b = new Node(3);
//         Node c = new Node(9);
//         Node d = new Node(8);
//         Node e = new Node(16);

//         a.next = b;
//         b.next = c;
//         c.next = d;
//         d.next = e;

//         middleElement(a);

//     }
// }


/*right middle in case of even number of nodes */

public class q5middleElement {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;

        }

    }
    public static void middleElement(Node head){
        
        Node slow = head;
        Node fast = head;

         while(fast!=null && fast.next!=null   ){
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.println(slow.data);
    }

    public static void main(String[] args) {
        Node a = new Node(5);
        Node b = new Node(3);
        Node c = new Node(9);
        Node d = new Node(8);
        Node e = new Node(16);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        middleElement(a);

    }
}
