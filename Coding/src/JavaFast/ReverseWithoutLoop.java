package JavaFast;

public class ReverseWithoutLoop {
    public static void main(String []args){
        String str= "Prashant";
        StringBuffer sb = new StringBuffer(str);
        sb.reverse();
        String rev = sb.toString();
        System.out.println("Reverse of"+str+"is - "+rev);

    }
}
