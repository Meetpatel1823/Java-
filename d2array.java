 import java.util.*;
public class d2array {
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        // int n= sc.nextInt();
        // System.out.println(" The Value You Have Entered Is :" + n);
        int rows=sc.nextInt();
        int cols=sc.nextInt();
        int[][] arr = new int[rows][cols];

        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                 arr[i][j]=sc.nextInt();
            }
        }
        int x=sc.nextInt();

        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                if(x==arr[i][j])
                System.out.print(i + " , " +j );
            }
            System.out.println();
        }

    }

    
}
