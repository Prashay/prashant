package JavaFast;

public class FirstnonRepeted {
    public static void main(String[] args) {
        String str = "spripnig";
        char[] ch = str.toCharArray();
        for (char c : ch) {
            if (str.indexOf(c) == str.lastIndexOf(c)) {
                System.out.println(c);
                break;
            }
        }
    }
}
