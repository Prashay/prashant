package HashMap;

public class Vowelcount {
    public static void main(String[] args) {
        String str = "interview";
        long count = str.chars().filter(i -> i == 'a' || i == 'e' || i == 'i' || i == 'o' || i == 'u').count();
        System.out.println(count);
    }
}
