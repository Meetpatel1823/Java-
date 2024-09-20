import java.util.*;
public class factorial {
    public static void main(String args[])
    {
        int fact = 1;
        System.out.println("Enter a number to FInd A Factorial : ");
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        for(int i =1;i<=n;i++)
        {
            fact*=i;
        }
        System.out.println("Factorial of Entered Number is : " + fact);
    }
}
