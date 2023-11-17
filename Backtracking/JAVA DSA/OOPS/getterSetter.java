/*With the help of getter and setter function made in same class,
 we can access the private properties of a class. */
class Student{
        private int rno;
        String name;

        public int getrno(){       //getter
            return rno;
        }

        public void setrno(int roll_number){    //setter
            rno = roll_number;
        }
    }
    public class getterSetter {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setrno(2);
        System.out.println(s1.getrno());
        
    }
}
