import java.util.*;

public class prefixSum {
    
static int[] ReturnPrefixSum(int arr[])
{
    int n = arr.length;
    int[] prefixSum = new int[n];
    int sum = 0;

    for(int i = 0;i<n;i++)
    {
        sum += arr[i];
        arr[i] = sum;
    }
    return arr;
} 

static void printArr(int arr[])
{
    for(int i = 0;i<arr.length;i++)
    {
        System.out.print(arr[i] + " ");
    }
}

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        printArr(arr);
        System.out.println();
        int[] prefixSum = ReturnPrefixSum(arr);
        printArr(arr);

    }
    
}
