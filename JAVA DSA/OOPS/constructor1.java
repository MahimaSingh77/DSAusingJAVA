/*Non Parameterised Constructor  */
/* 
class Student {
    Student(){
        System.out.println("Construtor called");
    }
}

public class constructor1 {
    public static void main(String[] args) {
        Student s1 = new Student();

         
    }
}
*/

import javax.print.attribute.standard.PrinterInfo;

/*********** Parameterised Constructor ************/
/* 
class Student {
    String name;
    int age;
    Student(String name , int age){
        this.name = name;
        this.age = age;
    }
    
}

public class constructor1 {
    public static void main(String[] args) {
        Student s1 = new Student("aman" , 21);
        

         
    }
}

*/



class Student {
    String name;
    int age;
   

    Student(Student s2){
        this.name = name;
        this.age = age;
    }
    Student(){
       
    }
    public void printInfo() {
        System.out.println(this.name);
        System.out.println(this.age);
    }
    
}

public class constructor1 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "aman";
        s1.age = 24;

        Student s2 = new Student(s1);
        s2.printInfo();
         
    }
}
