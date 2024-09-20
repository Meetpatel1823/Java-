public class rec1 {
    public static void printSum(int i,int n,int sum)
    {
        if(i==n)
        {
            System.out.println(sum+n);
            return;
        }
        sum+=i;
        printSum(i+1, n, sum);
    }
    public static void main(String[] args) {
        
    }
}
