 import java.util.*;
public class functions {
        public static void fcatorialOfNumber(int n)

        {
            
            int factorial = 1;

        for(int i=1;i<=n;i++)
    
        {
            factorial =factorial * i;
        }
        System.out.println(" fcatorial of given number is :" + factorial);
        return;
            

        }
            public static void main(String args[])
            {

        Scanner sc=new Scanner(System.in);
        int x= sc.nextInt();
        int factorial;
        fcatorialOfNumber(x);
        // int sum=multiplyTwoNumbers(a, b);
        // System.out.println("product of two numbers is : " + multiplyTwoNumbers(a, b));
       
        // String name= sc.next();

        // printMyName(name);

    
}
}
