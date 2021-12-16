package Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class
RemoveDuplicates {

    public static void main(String[] args) {

        List<String> arraylist = new ArrayList<String>();

        arraylist.add("instanceofjava");
        arraylist.add("Interview Questions");
        arraylist.add("Interview Programs");
        arraylist.add("java");
        arraylist.add("instanceofjava");

        System.out.println(arraylist);
        HashSet s = new HashSet();
        s.addAll(arraylist);
        arraylist.clear();
        arraylist.addAll(s);
        System.out.println(arraylist);
    }
}



