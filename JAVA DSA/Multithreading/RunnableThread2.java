public class RunnableThread2 implements Runnable {

    public void run() {

        int i = 1;
        while (true) {
            System.out.println(i + "Hello");
            i++;
        }
    }

    public static void main(String[] args) {
        RunnableThread2 t = new RunnableThread2();
        Thread th = new Thread(t);
        th.start();

        int i = 1;
        while (true) {
            System.out.println(i + "World");
            i++;
        }
    }
}
