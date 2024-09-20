import java.util.*;
public class SumQueries {

    static void printArr(int arr[])
    {
        for (int i = 1; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    static int[] prefixSum(int arr[])
    {
        int n = arr.length;
        int[] prefix = new int[n];
        for(int i = 1;i<n;i++)
        {
            prefix[i] = prefix[i - 1] + arr[i];
        }
return prefix;
    }
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int n = sc.nextInt();
        int[] arr = new int[n+1];
        System.out.println("Enter the elements of the array");
        for (int i = 1; i <= n; i++) {
            arr[i] = sc.nextInt();
            }
            int arr1[]=prefixSum(arr);
            printArr(arr1);

            System.out.println("ENTER NUM OF QUERIES : ");
            int q = sc.nextInt();
            for(int i=0;i<q;i++)
            {
                int sum = 0;
                System.out.println("ENTER L,R : ");
                int l = sc.nextInt();
                int r = sc.nextInt();
                sum = arr1[r] - arr1[l-1];
                System.out.println("SUM is : " + sum);
    }
    
}
}
