package number;
import java.util.*;

public class Primeno {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the No");
        int n = sc.nextInt();
        if(isprime(n)){
            System.out.println("Prime");
        }
        else{
            System.out.println("Not Prime");
        }
    }
    static boolean isprime(int n){
        int m = n/2;
        if(n==0 || n==1){
            return false;
        }
        for(int i=2;i<m;i++){
         if(n%i==0){
             return false;
         }
        }
        return true;
    }
}
