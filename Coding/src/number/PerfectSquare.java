package number;

import java.util.Scanner;

public class PerfectSquare {
    public static boolean perfectSqr(double n){
        for (int i =0;i*i<=n;i++){
            if(((n%i==0) && (n%i ==i)) ||(i*i == n)){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the no");
        double d = sc.nextDouble();
        if(perfectSqr(d)){
            System.out.println("yes");
        }
        else{
            System.out.println("No");
        }
        }
    }

