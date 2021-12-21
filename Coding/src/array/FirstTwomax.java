package array;

public class FirstTwomax {
    public static void main(String[]args) {
        int arr[]={11,19,12,43,24,15};
        int size=arr.length;
        int temp;
        for(int i=0;i<size;i++){
            for(int j=i+1;j<size;j++){
                if(arr[i] > arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
            System.out.print(arr[i]+" ");
        }
        System.out.println("2nd highest no is" + arr[size - 2]);
    }
}
