package JavaFast;

import java.util.*;

public class RemoveduplicateWithoutLoop {
    public static void main(String[] args){
        int arr [] ={1,2,3,5,7,5,5,7,2,1,8};
        Set st= new HashSet();
        for(int i=0;i<arr.length;i++){
            st.add(arr[i]);
        }
        Iterator it = st.iterator();
        while(it.hasNext()){
            System.out.print(it.next()+ " ");
        }
    }
}
