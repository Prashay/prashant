package interview;

public class Febonecy {


    static int febonecyno(int n){
        if(n<=1){
            return n;
        }
        else{
            return febonecyno(n-1)+febonecyno(n-2);
        }
    }
}
