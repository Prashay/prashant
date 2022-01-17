package interview;

import java.util.ArrayList;


public class SortArrayListExample2 {
    public static void main(String args[]) {
        ArrayList list = new ArrayList();
        list.add("Volkswagen");
        list.add("Toyota");
        list.add("Porsche");
        list.add("Ferrari");
        list.add("Mercedes-Benz");
        list.add("Audi");
        list.add("Rolls-Royce");
        list.add("BMW");
        System.out.println("ArrayList Before Sorting:");
        System.out.println("Before Sorting: " + list);
        int count = list.size();
        String temp;
        Object[] name = list.toArray();
        for (int i = 0; i < count; i++) {
            for (int j = i + 1; j < count; j++) {
                if (((String) name[i]).compareTo((String) name[j]) > 0) {
                    temp = (String) name[i];
                    name[i] = name[j];
                    name[j] = temp;
                }
            }
        }
        System.out.println("Sorted Arraylist: ");
        for (int a = 0; a < name.length; a++) {
            System.out.print(name[a] + " , ");
        }
    }
}
