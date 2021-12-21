package java8;


@FunctionalInterface
interface Addable {
    int add(int a, int b);

    default void state() {
        System.out.println("Default 1");
    }
}

public class SumAdd {

    public static void main(String[] args) {
        Addable ad1 = (a, b) -> (a + b);
        System.out.println(ad1.add(3, 4));
        ad1.state();
    }
}
