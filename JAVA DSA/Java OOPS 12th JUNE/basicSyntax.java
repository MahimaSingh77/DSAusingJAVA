// public class basicSyntax{
//     public static class Student{    //class is generally defined outside the main function because we can use it in other methods also.
//         String name;
//         int rno;
//         double percentage;
//     }

   
//    public static void main(String[] args) {
//     Student s1 = new Student();
//     s1.name = "Krishna" ;
//     s1.rno = 21 ;
//     s1.percentage = 88.6 ;

//     System.out.println(s1.name);
//     System.out.println(s1.rno);
//     System.out.println(s1.percentage);

   

//    } 
// }


public class basicSyntax{
    
   
   public static void main(String[] args) {
    class Student{
        String name;
        int rno;
        double percentage;
    }


    Student s1 = new Student();
    s1.name = "Krishna" ;
    s1.rno = 21 ;
    s1.percentage = 88.6 ;

    System.out.println(s1.name);
    System.out.println(s1.rno);
    System.out.println(s1.percentage);

   

   } 
}
