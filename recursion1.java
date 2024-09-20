import java.util.*;
public class recursion1 {
    public static  int PowOfXrN(int x,int n)
    {
        if(n == 0 )
        {
            return 1;
        }
        if( x  == 0)
        {
            return 0;
        }
        int xPowNm1= PowOfXrN(x,n-1);
        int xPowN=x*xPowNm1;
        return xPowN;

    }
    public static void main(String args[])
    {
        int x=2;
        int n=5;
        int ans=PowOfXrN(x,n);
        System.out.println(ans);

    }
}
