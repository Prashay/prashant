package JavaFast;

public class Palindrome {
    public static void main(String []args){
        String str,rev="";
        str ="madam";
        int length=str.length();
        for (int i=length-1;i>=0;i--){
            rev=rev+str.charAt(i);
        }
        if(str.equals(rev)){
            System.out.println("Pallindrome");


        }else{
            System.out.println("No its not");
        }
    }
}
