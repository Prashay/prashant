package JavaFast;

public class CreateThreadRun implements Runnable{
    public void run(){
        System.out.println("ITS  efheekek");
    }
    public static void main(String []args){
        CreateThreadRun tr = new CreateThreadRun();
        Thread thr = new Thread(tr);
        thr.start();
    }

}
