class Pen {
    String color;
    String type;

    public void write(){
        System.out.println("Writing something");
    }

    public void printColor(){
        System.out.println(this.color);
    }
}


public class Syntax1{
   public static void main(String args[]){
    Pen pen1 = new Pen();
    Pen pen2 = new Pen();
    pen1.color = "blue";
    pen1.type = "gel";

    pen1.write();
    pen2.color = "red";
    pen2.color = "ballPoint";

    pen1.printColor();
    pen2.printColor();


   } 
}