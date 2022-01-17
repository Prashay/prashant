package Personal;

class parent {
    public int area(int l, int b) {
        int area = l * b;
        return area;
    }
}

public class MethodOverridingNew extends parent {
    public static void main(String[] args) {
        MethodOverridingNew ov = new MethodOverridingNew();
        System.out.println(ov.area(10, 20));
    }

    @Override
    public int area(int l, int b) {
        int area = l * b;
        area = area / 2;
        return area;
    }
}
