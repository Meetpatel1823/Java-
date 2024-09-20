import java.util.*;
public class FreqArr {
           
          static int[] freqArr(int arr[])
          {
            int n = arr.length;
            int freqArr[] =new int[1005];
            for(int i = 0 ;i<n;i++)
            {
                freqArr[arr[i]]++;
            }
            return freqArr;
          }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of an array : ");

        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array Elements :");
        for (int i = 0; i < n; i++) {
            System.out.println("Enter " + (i+1) +"Element");
            arr[i] = sc.nextInt();
            }

            int[] freq = freqArr(arr);
            System.out.println("Enter Number of Queries");
            int q = sc.nextInt();

            while(q > 0)
            {
                System.out.println("Enter Number to be Searched : ");
                int x = sc.nextInt();

                if(freq[x] > 0)
                {
                    System.out.println("YES");
                }
                else{
                    System.out.println("NO");
                }

                q --;
            }
            
    }
    
}
