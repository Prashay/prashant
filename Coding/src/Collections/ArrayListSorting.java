package Collections;
import java.util.*;

public class ArrayListSorting {
    public static void main(String [] args){
        ArrayList al = new ArrayList();
        al.add(10);
        al.add(20);
        al.add(7);
        al.add(21);
        System.out.println(al);
        System.out.println("reverse----");
        Collections.reverse(al);
        System.out.println(al);
        System.out.println("Sorting---");
        Comparator cm = Collections.reverseOrder();
        //Collections.sort(al,cm);
        Collections.sort(al);
        System.out.println(al);

    }
}
