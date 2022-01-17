package Personal;

public class MethodOverloadingNew {
    public static void main(String[] args) {
        MethodOverloading m = new MethodOverloading();
        System.out.println(m.area(10, 20));
        System.out.println(m.area(10, 20, 30));
    }

    public int area(int l, int b) {
        int area = l * b;

        return area;
    }

    public int area(int l, int b, int h) {
        int area = l * b * h;

        return area;
    }
}
