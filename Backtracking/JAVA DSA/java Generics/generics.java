import java.util.*;

public class generics{
    
    public static void main(String[] args) {
        ArrayList<Integer> arraylist = new ArrayList();
       // arraylist.add("str1");
        arraylist.add(54);
        arraylist.add(643);

        // arraylist.add(new Scanner(System.in));

        int a = arraylist.get(2);  

        System.out.println(a);

       

    }
}