 import java.util.*;

public class patterns {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        // int n=4;
        // int m=5;

        // for(int i=1;i<=n;i++)
        // {
        //     for(int j=1;j<=m;j++)
        //     {
        //         if(i==1 || j==1 || i==n || j==m)
        //         {
        //             System.out.print("x");
        //         }else{
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }

        // n=5;
        // for(int i=n;i>=1;i--)
        // {
        //     for(int j=1;j<=i;j++){
        //         System.out.print("*");

        //     }
        //     System.out.println(" ");
        // }
        // System.out.println("");
        // int n=sc.nextInt();
        // for(int i=0;i<=n;i++)
        // {
        //     for(int j=1;j<=n-i;j++)
        //     {
        //         System.out.print(" ");
        //     }
        //     for(int j=1;j<=i;j++)
        // {
        //     System.out.print("*");
        // }
        // System.out.println();
        // }

// int n=5;
//         for(int i=1;i<=5;i++)
//         {
//             for(int j=1;j<=n-i+1;j++)
//             {
//                 System.out.print(j);
//             }
//             System.out.println();
//         }
// int number=1;
// for(int i=1;i<=5;i++)

// {
//     if(i%2==0)                     
//         {
//         System.out.print("0");

//         }
//         else{
//             System.out.print("");
//         }
        
//     for(int j=1;j<=i;j++)
//     {
//         if(j%2!=0)
//         System.out.print("1");
//         else
//         System.out.print("");
        
        
        
//     }
// //     System.out.println();
// // }
// for(int i=1;i<=5;i++)
// {
//     for(int j=1;j<=i;j++)
//     {
//         if((i+j)%2==0)
//         {
// System.out.print("1");
//         }
//         else
//         {
//             System.out.print("0");
//         }
//     }
//     System.out.println();
// }
int n=5;
//first half -- upperhalf;
for(int i=1;i<=n;i++)
{
    for(int j=1;i<=i;j++)
    {
        System.out.print("*");
    }
    //spaces ----
    int spaces= 2 * (n-i);
    for(int j=1;j<=spaces;j++)
    {
        System.out.print(" ");
    }
    //2nd upper stars ---
    for(int j=1;j<=i;j++)
    {
        System.out.print("*");
        
    }
    System.out.println();
}
for(int i=n;i<=1;i--)
{
    for(int j=1;i<=i;j++)
    {
        System.out.print("*");
    }
    //spaces ----
    int spaces= 2 * (n-i);
    for(int j=1;j<=spaces;j++)
    {
        System.out.print(" ");
    }
    //2nd upper stars ---
    for(int j=1;j<=i;j++)
    {
        System.out.print("*");
        
    }
    System.out.println();
}





    }

}
