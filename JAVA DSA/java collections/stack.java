import java.util.*;
public class stack{
    public static void main(String[] args) {
        Stack<String> animals = new Stack<>();

        animals.push("Lion");
        animals.push("Dog");
        animals.push("Horse");
        animals.push("Cat");

        System.out.println("stack " + animals);

        System.out.println( animals.peek());   //gives the last element entered .
        
        animals.pop();   //top element get removed

        System.out.println(animals);

        


    
    }
}