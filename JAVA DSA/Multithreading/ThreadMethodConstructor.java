public class ThreadMethodConstructor
 {
    class MyRun implements Runnable{
        public void run(){}
    }
  public static void main(String[] args) throws Exception
  {
    Thread t = new Thread(new MyRun());

  }  
}
