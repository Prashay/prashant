package java8;
interface Drae{
    void draw();
}

public class FunctionalDraw {
    public static void main(String [] args){
        int width =27;
        Drae d = new Drae(){
            public void draw(){
                System.out.println("drw"+width);
            }
        };
        d.draw();
    }
}
