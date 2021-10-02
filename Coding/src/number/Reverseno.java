package number;
import java.util.*;

public class Reverseno {
    public static void main(String[]args){
        int num,rev =0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Entr the no");
         num = sc.nextInt();

        while(num!=0) {
            int rem = num %10;
            rev = rev*10+rem;
            num = num/10;
        }
        System.out.println(rev);
    }
}
