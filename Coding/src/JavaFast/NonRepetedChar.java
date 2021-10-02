package JavaFast;

public class NonRepetedChar {
    public static void main(String []args){
        String str ="character";
        char ch[] = str.toCharArray();
        for (char i :ch){
            if(str.indexOf(i)==str.lastIndexOf(i)){
                System.out.println(i);
                break;
            }
        }

    }
}
