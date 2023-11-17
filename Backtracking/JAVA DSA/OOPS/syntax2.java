class Student {
    String name;
    int age;

    public void printInfo() {
        System.out.println(this.name);
        System.out.println(this.age);
    }
}

public class syntax2 {
    public static void main(String[] args) {
        Student s1 = new Student();   //Here "Student() is constructor"
        s1.name = "shradha";  
        s1.age = 22; 

        s1.printInfo();
        

    }

}
