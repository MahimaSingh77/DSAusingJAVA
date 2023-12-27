public class mainThread2 extends Thread {
    public void run() {

        int i = 1;
        while (i<4) {
            System.out.println(i + "Hello");
            i++;
        }
    }

    public static void main(String[] args) {
        mainThread2 t = new mainThread2();
        t.start();

        int i = 1;
        while (i<4) {
            System.out.println(i + "World");
            i++;
        }
    }
}
