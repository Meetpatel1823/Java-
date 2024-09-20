public class pacsal2 {
    public static void main(String[] args) {
    
        pattern2(5);

    }

    static void pattern2(int n)
    {
        for(int i = 1 ; i <=n ;i++)
        {
            for(int j = 1 ;j<= n-i;j++)
            {
                System.out.print(" ");
            }

            int c = 1;
            for(int line = 1;line <=i;line++)
            {
                System.out.println(c + " ");
                c = c * (i - line)/line;
            }
        }
    }


}
