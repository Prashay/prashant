package JavaFast;

public class DeleteFirstAndLastCharactr {
    public static void main(String []args){
        String str="Java Main";
        int length=str.length();
        //Method 1
        System.out.println(str.substring(1,length-1));
        //method 2
        StringBuffer sb = new StringBuffer(str);
        sb.deleteCharAt(0);
        sb.deleteCharAt(sb.length()-1);
        System.out.println(sb.toString());
    }
}
