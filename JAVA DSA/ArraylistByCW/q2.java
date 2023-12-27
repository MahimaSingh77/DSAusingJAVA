import java.util.*;

/*Write a program to sort an ArrayList in descending order */
public class q2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Welcome");
        list.add("To");
        list.add("Chitkara");
        list.add("Club");
        System.out.println("original List" + list);
        Collections.sort(list, Collections.reverseOrder()); // lexicographically descending order

        System.out.println("Reversed List" + list);
    }
}
