import java.util.*;
public class shorting {
    public static void printMyArray(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i] + " ");
        }

    }
    public static void main(String args[])
{
Scanner sc= new Scanner(System.in);
int arr[]= {5,6,3,8,10,4};
// bubble short 
// for(int i=0;i<arr.length-1;i++)
// {
//     for(int j=0;j<arr.length-i-1;j++)
//     {
//         if(arr[j]>arr[j+1])
//         {
//             int temp= arr[j];
//             arr[j]=arr[j+1];
//             arr[j+1]=temp;
//         }
//     }
// }
for(int i=0 ;i<arr.length-1;i++)
{
    int smallest=i;
    for(int j=i+1;j<arr.length;j++)
    {
        if(arr[smallest] >arr[j])
        {
            smallest=j;
        }

    }
    int temp= arr[smallest];
    arr[smallest]=arr[i];
    arr[i]=temp;

}
printMyArray(arr);


    
}
    
}
