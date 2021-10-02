package array;

public class DuplicateNo
{
    public static void main(String []args){
        int arr [] ={1,2,3,5,7,5,5,7,2,1,8};
        for (int i=0;i<arr.length;i++){
            int count =0;
            for (int j =0;j<arr.length;j++){
                if((arr[i]==arr[j])&& (i!=j)){
                   count++;
                }
            }
            if(count==0){
                System.out.print(arr[i]+" ");
            }
        }
    }
}
