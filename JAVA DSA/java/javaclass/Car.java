public class Car{
    String make;
    String model;
    int year;
    public void drive()
    {
                System.out.println("Driving the " +
                 year + " " + make + " " + model);
                
            }
        public static void main(String[] args){
            System.out.println("hello");
            
                Car myCar = new Car();
                myCar.make="Toyota";
                myCar.model = "Camry";
                myCar.year = 2020;

                myCar.drive();

                
                    
        }
   


           
        
        
}
