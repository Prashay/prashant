package string;
interface Parent{
    void par();
}
interface Parents{
    void par();
}
 abstract class Test implements Parent,Parents
{
   public void par(){
   System.out.println("Test");
    }
}
public class polymory extends Test {
    public static void main(String []args){
     Parent p = new polymory();
     p.par();
    }
}
