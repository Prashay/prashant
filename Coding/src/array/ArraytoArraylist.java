package array;
import java.util.*;

public class ArraytoArraylist {
    public static void main(String[] args) {
        int arr[]={10,20,30,60,40};
        ArrayList <Integer>ar= new ArrayList<Integer>(arr.length);

        ar.add(29);
        for(int i :arr){
            ar.add(i);
        }
        System.out.print(ar);

    }
}
