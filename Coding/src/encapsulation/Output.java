package encapsulation;

public class Output {
    /*public static void main(String[] args){
        //1
        // String str1="Hello";
        str1.concat("Prashanth");
        str1.toUpperCase();
        System.out.println(str1);

        String test = null;
        System.out.println("Output is ::" + test.trim());



    }
    //2
    public static void main(String[] args) {
        method(null);
    } public static void method(Object o) {
        System.out.println("Object method");
    }
    public static void method(String s) {
        System.out.println("String method");
    }
    //3
    public static void main(String[] args){
        Integer num1 = 100;
        Integer num2 = 100;
    if(num1==num2){
        System.out.println("num1 == num2");
    }
    else
        {
            System.out.println("num1 != num2");
        }
    }*/
    public static void main(String[] args){
        String str1 ="test";
        str1.concat("Prashanth");
        str1.toUpperCase();
        System.out.println(str1);

        String test = null;
        System.out.println("Output is ::" + test.trim());
    }
    public static void main(String args){
        System.out.println("Overloaded main method");
    }

}
