package JavaFast;

public class NoOfOccurenceOfCharacter {
    public static void main(String []args){
        String str ="prashant";
        int counter[]=new int[256];
        for (int i=0;i<str.length();i++){
            counter[str.charAt(i)]++;
        }
        char arr[] = str.toCharArray();
        for (int i=0;i<str.length();i++){
            arr[i]=str.charAt(i);
            int flag=0;
            for (int j=0;j<=i;j++){
                if(arr[j]==str.charAt(i)){
                    flag++;
                }
            }
            if(flag==1){
                System.out.println("Total no of occurence  "+str.charAt(i)+" is "+counter[str.charAt(i)]);
            }

        }
        System.out.println("Postion of a "+str.lastIndexOf("p"));
    }
}
