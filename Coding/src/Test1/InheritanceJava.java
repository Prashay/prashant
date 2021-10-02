package Test1;


/*
class Animal {
    String name;
    void nature(){
        System.out.println("Animal Test");
    }
}
class Fish extends Animal{
    String color ;

    @Override
    void nature() {
        System.out.println("Test fish");
        super.nature();
    }
}*/
public class InheritanceJava {
    static int area(int l,int b){
        int var ;
        var =l*b;
        return var;
    }
    static int area(int l,int b,int h){
        int var1 ;
        var1 =l*b*h;
        return var1;
    }

    public static void main(String[]args){
       /* Animal a = new Fish();
        a.name ="Rohu";
        a.nature();
        System.out.println("output--"+a.name);
        Fish f1 = new Fish();
        f1.color="Red";
        System.out.println("output--"+f1.color);
        f1.name ="pink";
        System.out.println("output--"+f1.color+"--"+f1.name);*/
        InheritanceJava in = new InheritanceJava();
        System.out.println(in.area(10,20));
        System.out.println(in.area(10,20,30));



    }

}
