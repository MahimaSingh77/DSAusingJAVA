import java.util.*;
/* 
public class arrraylist {
    public static void main(String[] args) {
        // Wrapper classes
        System.out.println(("Wrapper Class "));
        Integer a = Integer.valueOf(4);
        System.out.println(a);
        Float f = Float.valueOf(4.5f);
        System.out.println(f);

        // Arraylist

        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Boolean> l2 = new ArrayList<>();
        ArrayList<Float> l3 = new ArrayList<>();
        // add new elements
        l1.add(5);
        l1.add(6);
        l1.add(7);
        l1.add(8);

        // get an element at index i
        System.out.println("get an element using index in Array list");
        System.out.println(l1.get(0)); // 5
        System.out.println(l1.get(1)); // 6
        
        // print with for loop
        System.out.println("Printing the elements using for loop ");
        for (int i = 0; i < l1.size(); i++) {
            System.out.println(l1.get(i));
        }

        // printing the array list directly
        System.out.println("printing the array list directly");
        System.out.println(l1); // [5, 6, 7, 8]

        // adding element at some index i // [5 100 6 7 8]
        System.out.println("l1 after adding 100 at index 1");
        l1.add(1, 100);
        System.out.println(l1);     // [5, 100 , 6, 7, 8]

        //modifying element at index i
        l1.set(1 , 101);
        System.out.println(l1);  // [5, 101, 6, 7, 8]

        //removing an element at index i
        l1.remove(1);
        System.out.println(l1);  //[5, 6, 7, 8]

        //removing an element e
        l1.remove(Integer.valueOf(7));
        System.out.println(l1);   // [5, 6, 8]
      

        //checking if an element exists
        System.out.println(l1.remove(Integer.valueOf(34)));

    //***OR***

        boolean ans = l1.contains(Integer.valueOf(34));
        System.out.println(ans);
        boolean ans2 = l1.contains(Integer.valueOf(5));
        System.out.println(ans2);


        //if you don't specify class, you can put anything inside l
        ArrayList l = new ArrayList();
        l.add("pqrs");
        l.add(1); 
        l.add(true);
        System.out.println(l); 
        
        
    }
}

*/

public class arrraylist {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();

        students.add("rakesh");
        students.add("jh");

        System.out.println(students);

        students.add(1 , "mahima");
        System.out.println(students);

        students.get(1);

        students.remove(String.valueOf("mahima"));
        System.out.println(students);

        //to iterate
        // for(int i=0;i<students.size(); i++){
        //     System.out.println(students.get(i));
        // }

        // for(String  element : students){
        //     System.out.println(element);
        // }

        Iterator<String> it = students.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }


    }
}