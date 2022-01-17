package Personal;

public class ThreadCreateOne extends Thread {
    public static void main(String[] arg) {
        ThreadCreateOne t = new ThreadCreateOne();
        t.start();
    }

    public void run() {
        System.out.println("Running Method");
    }
}

