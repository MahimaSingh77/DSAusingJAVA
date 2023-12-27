import java.util.*;
public class map{
    public static void main(String[] args) {
        Map<String , Integer> numbers = new HashMap<>();

        numbers.put("One" , 1);
        numbers.put("Two" , 2);
        numbers.put("Three" , 3);

        if(!numbers.containsKey("Two")){
            numbers.put("Two" , 23);
        }

        numbers.put("Three" , 4);   //this will upgrade the key of  three



        System.out.println(numbers);

        System.out.println(numbers.containsValue(3));

        
    }
}