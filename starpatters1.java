public class starpatters1 {
 public static void main(String[] args) {
 pattern1(5);
 System.out.println();
 pattern2(5);
 System.out.println();

 pattern3(5);
 System.out.println();
 pattern4(5);
 System.out.println();
 pattern5(5);
 System.out.println();
 pattern6(5);
 System.out.println();
 pattern7(5);




   
}

static void pattern1(int n)
{
    for(int i = 1;i<=5;i++)
    {
        for(int j = 1;j<=5;j++)
        {
            System.out.print("* ");
        }
        System.out.println();
    }
}
static void pattern2(int n)
{
 
    for(int i = 1;i<=5;i++)
    {
        for(int j = 1;j<=i;j++)
        {
            System.out.print("* ");
        }
        System.out.println();
    }   
}
static void pattern3(int n)
{
 
    for(int i = 1;i<=5;i++)
    {
        for(int j = 1;j<=n-i+1;j++)
        {
            System.out.print("* ");
        }
        System.out.println();
    }   
}

static void pattern4(int n)
{
 
    for(int i = 1;i<=n;i++)
    {
       for(int j = 1;j<=i;j++)
       {
System.out.print(j+" ");
       }
        System.out.println();
    }   
}
//pattern 5 :
static void pattern5(int n)
{
 
    for(int i = 1;i<=2*n-1;i++)
    {
        int count = i > n ? 2*n - i:i;
      for(int j = 1;j<=count;j++)
      {
       System.out.print("* ");
        
      }
      System.out.println();
    }   
}

//pattern 6:
static void pattern6(int n)
{
    for(int i = 1;i<=n;i++)
    {
     int count = i > n ? 2*n - i:i;
     int spaces = n-count;

     for(int space = 1 ; space <= spaces;space++)
     {
        System.out.print(" ");
     }
      for(int j = 1;j<=count;j++)
      {
       System.out.print("* ");
      }
      System.out.println();
    }   
}



//pattern :7

static void pattern7(int n)
{
    for(int i = 1;i<=n;i++)
    {
     int count = i;
     int spaces = n-count;

     for(int space = 1 ; space <= spaces;space++)
     {
        System.out.print(" ");
     }
      for(int j = 1;j<=count;j++)
      {
       System.out.print("1 ");
      }
      System.out.println();
    }   
}
//         1
//       1 2 1 
//      1 3 3 1
//     1 4 5 4 1
//
//






}
