package Personal;

public class DemonThread extends Thread {
    public static void main(String[] args) {

        DemonThread d1 = new DemonThread();
        DemonThread d2 = new DemonThread();
        d1.setDaemon(true);
        d1.start();
        d2.start();
    }

    public void run() {
        if (Thread.currentThread().isDaemon() == true) {
            System.out.println("demon");
        } else {
            System.out.println("non demon");
        }
    }
}
