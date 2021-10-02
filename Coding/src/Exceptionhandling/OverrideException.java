package Exceptionhandling;

class parent{
    void msg() throws ArithmeticException{
        System.out.println("Its Parent");
    }
}

public class OverrideException extends parent{
    void msg()throws ArithmeticException{
      throw new ArithmeticException("Tester child");
    }
    public static void main(String[] args){

        OverrideException oo= new OverrideException();
        oo.msg();

        System.out.println("Its main method");
    }
}
