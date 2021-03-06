package Collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListSorting {
    public static void main(String[] args) {
        List<String> al = new ArrayList<String>();
        al.add("Apple");
        al.add("Graps");
        al.add("Cabage");
        al.add("Banana");


        System.out.println(al);//unshorted

        System.out.println("Sorting---");
        int size = al.size();
        String temp;
        Object[] Fruit = al.toArray();

        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (((String) Fruit[i]).compareTo((String) Fruit[j]) > 0) {
                    temp = (String) Fruit[i];
                    Fruit[i] = Fruit[j];
                    Fruit[j] = temp;
                }
            }
        }
        for (int i = 0; i < Fruit.length; i++) {
            System.out.print(Fruit[i] + " ");
        }
    }

}