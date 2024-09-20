import java.util.*;
public class RotateArr {

    static int[] rotate(int arr[],int key)
{
    int n = arr.length;
    key = key % n;
int ans[] = new int[n];
    int j = 0;
    for(int i = n-key;i < n ;i++)
    {
        ans[j++] = arr[i];
    }
    for(int i = 0;i < n-key;i++)
    {
        ans[j++] = arr[i];
    }
    return ans;

}
static void printArr(int arr[])
{
    for(int i = 0 ;i<arr.length;i++)
    {
        System.out.print(arr[i] + "-");
    }
}
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        int key = 1;
        int ans[] = rotate(arr,key);
        printArr(ans);
        
    }
}
