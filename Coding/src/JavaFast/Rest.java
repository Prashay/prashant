package JavaFast;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.*;
import java.util.Locale;

public  class Rest {
    public static void main(String []args){
      String str ="character is dhila to kho is dhila";
      String arr[] = str.split(" ");
        List ls = new ArrayList();
        Set sr =new LinkedHashSet();

        for (String ar :arr){
            if(!sr.add(ar)){
                ls.add(ar);
            }
        }
        System.out.print(ls);
      }
}


