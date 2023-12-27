

class pen{
        String colour;
        String type;

        public void write(){
        System.out.println("Writing Something");
    }

    public void printcolor(){
        System.out.println(this.colour);
    }
}

public class oops {
    public static void main(String[] args) {
        pen pen1 = new pen();
        pen1.colour = "blue";
        pen1.type = "gel";

        pen pen2 = new pen();
        pen2.colour = "black";
        pen2.type = "ballpoint";

        pen1.write();
        pen1.printcolor();

        pen2.printcolor();

        
    }
}
