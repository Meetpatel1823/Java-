import java.util.*;
public class sumOFN {
    public static void main(String args[])
    {
        int n=0;
        System.out.println("ENter the size of n : ");

        Scanner sc=new Scanner(System.in);
        int m = sc.nextInt();
        for(int i =1;i<=m;i++)
        {
            n = n + i;
        }
System.out.println("Sum of " + m + " Natural NUmber is : " + n);
    }
    
}
