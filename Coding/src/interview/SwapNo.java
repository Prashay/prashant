package interview;
import java.util.*;

public class SwapNo {
public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter first no");
    int a = sc.nextInt();
    System.out.println("Enter Second no");
    int b = sc.nextInt();

    b = a+b;
    a = b-a;
    b = b-a;

    System.out.println("Enter first no after  swap "+a);
    System.out.println("Enter Second no after swap "+b);
}
}
