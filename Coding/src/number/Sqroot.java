package number;
import java.util.*;

public class Sqroot {
    public static double sqrtroot(int num){
        double t;
        double sqrt =num/2;
        do{
           t= sqrt;
           sqrt = (t+(num/t))/2;
        }
        while((t-sqrt)!=0);
         return sqrt;
        }
        public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the no");
        int n = sc.nextInt();
        System.out.println("the square root is  = "+sqrtroot(n));
        }
    }

