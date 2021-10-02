package number;
import java.util.*;

public class Atmorphic {
    public static  boolean isAtmor(int num){
       int sqr = num*num;
       while(num>0){
       if (sqr % 10 != num % 10){
           return false;
       }
       num =num/10;
       sqr =sqr/10;
       }
       return true;
    }
    public static void main(String []args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the no");
        int numb=sc.nextInt();
        if(isAtmor(numb)){
            System.out.println("Atmorphic");
        }
        else{

            System.out.println("NO");
        }

    }
}
