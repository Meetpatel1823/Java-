public class hollow {
public static void main(String[] args) {
         int n = 5;
         int num= 1;
      
         for(int i = 0 ; i <=5 ;i++)
         {
            for(int j = 0 ; j <= 5 ;j++)
            {
                if(i==0 || i==n)
                {
                    System.err.print(num++ + " ");
                }
                else if (j==0 || j==n) {
                    System.out.print(num++ + " ");
            
                }else
                {
                    System.out.print("  ");
                }

          
            }
            System.out.println();
            num = 1;
            
         }


      }    
}
