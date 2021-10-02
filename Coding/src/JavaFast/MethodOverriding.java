package JavaFast;

class Test {

    int area(int l,int b){
        int areas;
        areas= l*b;
        return areas;

    }

}
public class MethodOverriding extends Test{
    @Override
    int area(int l, int b) {
        int areas;
        areas = l*b;
        areas = areas/2;
        return areas;
    }

    public static void main(String []args){
        Test t = new MethodOverriding();
       System.out.println(t.area(20,30));
    }
}
