package JavaFast;

public class MethodOverloading {
    public static int area(int l,int b){
        int area;
        area= l*b;
        return area;
    }
    public static int area(int l,int b,int h){
        int area;
        area= l*b*h;
        return area;
    }

    public static void main(String []args){
        System.out.println(area(10,20));
        System.out.println(area(10,20,30));

    }
}
