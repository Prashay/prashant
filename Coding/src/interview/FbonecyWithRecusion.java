package interview;

public class FbonecyWithRecusion {
     static int n1=0;static int n2=1;static int n3 =0;
    public static void main(String[]args){

        int count =10;
        System.out.print(n1+" "+n2);
        printfebonecy(count-2);
    }
    static void  printfebonecy(int count){
        if(count>0){
            n3=n1+n2;
            n1=n2;
            n2=n3;
            System.out.print(" "+n3);
            printfebonecy(count-1);

        }

    }}
