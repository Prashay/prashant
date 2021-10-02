package JavaFast;

public class CreateThread extends Thread{
    public void run(){
        System.out.println("its time");
    }
    public static void main(String[]args){
        CreateThread th = new CreateThread();
        th.start();
    }
}
