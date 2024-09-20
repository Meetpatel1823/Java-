import java.util.*;
public class recursion {
    public static void factOfN(int a,int b,int n)
    {
         if(n==0) {
            return;
         }
         
         int fib = a + b;
         System.out.println(fib);
         a=b;
         b=fib;
         factOfN(a, fib, n-1);

    }
    public static void main(String args[])
    {
int a= 0;
int b=1;
int sum=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the values of n");
int n = sc.nextInt();
factOfN( a, b, n-2);
    }
}
