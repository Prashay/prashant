package Personal;

class Parent {
    public int area(int l, int b) {
        int area = l * b;

        return area;
    }
}

public class MethodOverriding extends Parent {
    public static void main(String[] arg) {
        MethodOverriding mt = new MethodOverriding();
        System.out.println(mt.area(10, 30));
    }

    @Override
    public int area(int l, int b) {
        int area = l * b;
        area = area / 2;

        return area;
    }
}
