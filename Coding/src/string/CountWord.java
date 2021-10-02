package string;

public class CountWord {
    public static void main(String []args){
        String str ="my name is anthony anthony";
        int length = str.length();
        int count =1;


        for (int i =0;i<length-1;i++){
            if((str.charAt(i)==' ') && (str.charAt(i+1)!=' ')){
                count++;
            }
        }
        System.out.println("toatal words in "+str+" = "+count);
    }
}
