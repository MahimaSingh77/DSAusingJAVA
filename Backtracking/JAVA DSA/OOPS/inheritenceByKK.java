public class inheritenceByKK {
    public class Box{
        double l; 
        double h;
        double w;

        Box(){
          this.h=-1;
          this.l=-1;
          this.w=-1;  
        }

        //cube
        Box(double side){
            this.w=side;
            this.l=side;
            this.h=side;


        }


    


    }

    public static void main(String[] args) {
        
        Box box = new Box(4.5,6.7,7.9);

        System.out.println(box.l + " " + box.w + " " + box.h);
    }
}
