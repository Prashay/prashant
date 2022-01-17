package Personal;

public class StringBase {
    public static void main(String[] args) {
        String str1 = "Name";
        String str2 = "Name";
        String str3 = new String("Name");
        if (str1.equals(str2)) {
            System.out.println("Str1 equals");
        } else {
            System.out.println("Not eqals");
        }
        if (str1 == str2) {
            System.out.println("Str1 == str2");
        } else {
            System.out.println("Str1 != str2");
        }
        if (str1.equals(str3)) {
            System.out.println("Str1 equals str3");
        } else {
            System.out.println("Not eqals");
        }
        if (str1 == str3) {
            System.out.println("Str1 == str3");
        } else {
            System.out.println("Str1 != str3");
        }
    }
}
