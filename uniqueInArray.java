import java.util.*;
public class uniqueInArray {

    static void UniqueElement(int arr[])
    {
        int n = arr.length;
        int n1 = 0;
        for(int i = 0;i<n;i++)
        {
            for(int j = i+1;j<n;j++)
            {
                if(arr[i]==arr[j])
                {
                    arr[i]=-1;
                    arr[j]=-1;
                }
               
            }
        }
        for(int i = 0;i<n;i++)
        {
            if(arr[i]!=-1)
            {
                System.out.println(arr[i]);
                }
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[]={1,2,3,1,2,3,4};
        UniqueElement(arr);
        
    }
}
