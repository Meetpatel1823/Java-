 import java.util.*;
public class arrays{

public static void main(String args[])
{
    Scanner sc= new Scanner(System.in);
//     int[] marks = new int[3];
//     // marks[0]=99;
//     // marks[1]=90;
//     // marks[2]=100;
//     // System.out.println(marks[0]);
//     // System.out.println(marks[1]);
//     // System.out.println(marks[2]);
//     for(int i=0;i<3;i++)
//     {
//         marks[i]=sc.nextInt();
        
//     }
//      for(int i=0;i<3;i++)
//     {
// System.out.println( " Marks You Have Entered Are : "+ marks[i]);
        
//     }
int size = sc.nextInt();
int[] arr = new int[size];
for(int i=0;i<arr.length;i++)
{
    arr[i]=sc.nextInt();
}
int x=sc.nextInt();
for(int i = 0; i<arr.length;i++)
{
    if(arr[i]==x)
    {
        System.out.println(" x is found at position " + i);
        break;
    }
}

    
}

}