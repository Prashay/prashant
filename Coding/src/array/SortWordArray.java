package array;

public class SortWordArray
{
    static void Sort_ar(String[]st,int n){
        for(int i=0;i<n;i++){
            String temp =st[i];
            int j=i-1;
            while (j>=0 &&temp.length()<st[j].length()){
                st[j+1]=st[j];
                j--;
            }
            st[j+1]= temp;
        }
    }
    public static void main(String[]args){
        String[]arr={"This","is","a","book"};
        int length= arr.length;
        Sort_ar(arr,length);
        System.out.print("the " +
                "value of =");
        for (int i=0;i<length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
