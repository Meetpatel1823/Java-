public class GCD {

    public static int GCD(int a ,int b)
    {
        if(a==0 || b==0)
        {
            int c = a == 0 ? a : b;
            return c;
        }
        if(b%a==0)
        {
            return a;
        }
        else{
            return GCD(b%a,a);
        }
     
    }
    public static void main(String[] args) {
        int num1 = 12;
        int num2 = 18;
        int result = GCD(num1,num2);
        System.out.println(result);
    }
    
}
