import java.util.*;
public class ReverseArray {
    
    static void ReverseArr(int arr[])
    {
        int ans[] = new int[arr.length];
        int j = 0 ;
        for(int i = arr.length-1;i>=0;i--)
        {
          ans[j++]=arr[i];
        }
        for(int i = 0;i<ans.length;i++)
        {
            System.out.print(ans[i]+" ");
        }

    }
   
    public static void main(String[] args) {
        
        int arr[]={1,2,3,4,5,6,7};
        ReverseArr(arr);

    }
}
