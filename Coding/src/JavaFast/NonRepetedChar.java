package JavaFast;

public class NonRepetedChar {
    public static void main(String []args){
        String str = "stringsg";
        char[] ch = str.toCharArray();
        for (char c : ch) {
            if (str.indexOf(c) != str.lastIndexOf(c)) {
                System.out.println(c);

            }
        }

    }
}
