package Collections;
import java.util.*;

public class ArrayShift{
    public static void main(String []args){
        ArrayList<Integer> ar = new ArrayList<Integer>();
        ar.add(1);
        ar.add(2);
        ar.add(3);
        ar.add(4);
        ar.add(5);
        ar.add(5);
        ar.add(5);
        System.out.println(ar);
        LinkedHashSet hs = new LinkedHashSet();
        hs.addAll(ar);
        ar.clear();
        ar.addAll(hs);
        System.out.println(ar);

    }
}
