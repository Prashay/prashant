package interview;

public class CountOccurenceCharacter {
public static void main(String [] args){
    String str = "Prashant";
    int counter[] = new int[256];
    int length = str.length();
    for (int i = 0; i < length; i++) {
        counter[str.charAt(i)]++;
    }
    char array[]= new char[str.length()];
    for (int i = 0;i < length;i++){
        array[i] = str.charAt(i);
        int flag=0;
        
        for (int j = 0; j <= i; j++) {
            if (str.charAt(i) == array[j])
                flag++;
        }
        /*if(flag==1){
        System.out.println("No of occurence of "+str.charAt(i)+ " : "+ counter[str.charAt(i)]);
    }*/

        if(counter[str.charAt(i)]>1){
            System.out.print(str.charAt(i));
        }
    }
}
}
