package Exceptionhandling;

class InvalidAge extends Exception{
    InvalidAge(String s){
        super(s);
    }

}
public class CustomException {
    static void validate(int age)throws InvalidAge{
    if(age <19){
        throw new InvalidAge("Please come after 19");
    }
    else{
        System.out.println("Welcome to vote!");
    }

    }
    public static void main(String []args){
        try{
            validate(16);
        }
        catch(Exception m){
            System.out.println(m);
        }
    }
}
