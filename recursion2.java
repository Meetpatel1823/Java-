import java.util.*;
public class recursion2 {
    public static void towerOfHeoni(int n,String src,String hlpr,String dest)
    {
        if(n==1)
        {
        System.out.println("Transfer disk " + n + " from" + src+ " to" + dest); 
        return;   
        }
       towerOfHeoni(n-1,src,dest,hlpr);
       System.out.println("Transfer disk " + n + " from" + src+ " to" + dest);
       towerOfHeoni(n-1,hlpr,src,dest);


    }
   
    public static void main(String args[])
    {
        int n = 2;
towerOfHeoni(n, " S ", " H "," D ");

    }
}
