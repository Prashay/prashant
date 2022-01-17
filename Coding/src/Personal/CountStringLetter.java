package Personal;

public class CountStringLetter {
    public static void main(String[] args) {
        String str = "nandan";
        int counter[] = new int[256];
        for (int i = 0; i < str.length(); i++) {
            counter[str.charAt(i)]++;
        }
        char arr[] = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            arr[i] = str.charAt(i);
        }
    }
}
