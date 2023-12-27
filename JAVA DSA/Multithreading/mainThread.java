// import java.util.*;

class myThread extends Thread {
    public void run() {
        int i = 1;
        while (i<4) {
            System.out.println(i + " Hello");
            i++;
        }
    }
}

public class mainThread {
    public static void main(String[] args) {
        myThread t = new myThread();
        t.start();

        int i = 0;
        while (i<4) {
            System.out.println(i + " World");
            i++;
        }
    }
}
