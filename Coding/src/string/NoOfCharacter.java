package string;

public class NoOfCharacter {
    public static void main(String[]args){
        String Str ="Totallysix member";
        int count =0;
        int length=Str.length();
        for (int i=0;i<length;i++){
            if(Str.charAt(i)!= ' '){
                count++;
            }
        }
        System.out.println("Total no of character = "+ count);
    }
}
