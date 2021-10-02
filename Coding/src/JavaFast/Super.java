package JavaFast;
import java.io.*;
 class SuperClass {
    public void start() throws IOException, Exception {
        throw new IOException("can't operate on file");
    }
}

class SubClass extends SuperClass{
    @Override public void start() throws Exception{
        throw new Exception("Not able to start");
    }
}
public class Super{
     public static void main(String []args) throws Exception {
         SubClass sc = new SubClass();
         sc.start();
     }

}
