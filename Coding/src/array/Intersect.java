package array;

public class Intersect {
    public static void main(String[]args){
        int i,j,k,c=0;
        int a[] ={2,5,4,6,7};
        int b[]= {2,5,8,9,3};
        System.out.println();
        int z[] =new int[a.length+b.length];
        for (i =0;i<a.length;i++){
            for(j=0;j<b.length;j++){
                if(a[i]==b[j]){
                    z[c]=a[i];
                    c++;
                }
                else continue;
            }
        }
   for(k=0;k<c;k++){
     System.out.print("["+z[k]+"]");
   }
    }
}
