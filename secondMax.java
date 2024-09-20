import java.util.*;
public class secondMax {

   static int findMax(int arr[])
   {
    int max = Integer.MIN_VALUE;
    for(int i = 0 ;i<arr.length;i++)
    {
        if(arr[i]> max)
        {
            max=arr[i];
        }

    }
return max;
   }
   static int findSecondMax(int arr[])
   {
       int max= findMax(arr);

       for(int i = 0;i<arr.length;i++ )
       {
           if(arr[i]==max)
           {
               arr[i]= Integer.MIN_VALUE;
           }
       }
       int secondmax = findMax(arr);
       return secondmax;

   }
    public static void main(String args[])
    {
        int arr[]={1,2,3,4,5,6,7};
        System.out.println(findSecondMax(arr));
       

    }
}
