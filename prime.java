import java.util.Scanner;

public class prime {
    public static void main(String args[])
    {
        System.out.println("ENter A number To Check Whether IT is Prime Or Not");
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int flag = 0;
        for(int i=1;i<=n/2;i++)
        {
            if(n%i==0)
            {
                 flag =1;
            }
            else
            {
                flag =0 ;
            }
        }


        if(flag == 0)
        {
            System.out.println("Number is Prime ");
            
        }
        else{
            System.out.println("Number is not Prine");
        }


    }
}
