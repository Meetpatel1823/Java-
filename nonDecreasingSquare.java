public class nonDecreasingSquare {
    static void printArr(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
            }
    }

   static int[] nonDecSquare(int arr[])
    {
        int n = arr.length;
        int[] ans = new int[n];
        int left = 0;
        int right = n-1;
        int k = n-1;

        while(left<=right)
        {
            if(Math.abs(arr[left])>Math.abs(arr[right]))
            {
                ans[k--] = arr[left]*arr[left]; 
                left++;
            }
            else{
                ans[k--] = arr[right]*arr[right];
                right--;
            }
            
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[] ={-10,-2,1,5,7,9};
        printArr(arr);
        System.out.println();
        int[] ans = nonDecSquare(arr);
        printArr(ans);



        
    }
    
}
