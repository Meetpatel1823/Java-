import java.util.*;

public class leapYear {
    public static void main(String args[])
    {
        int year;
System.out.println("Enter your to check whether Leap Year or not : ");
Scanner sc= new Scanner(System.in);
year=sc.nextInt();
if(year%400==0)
{
    System.out.println("Leap");
}
else  if (year%100==0)
{
    System.out.println("Leap");

}
else if(year%4==0)
{
    System.out.println("Leap");

}
else
{
    System.out.println("NOt Leap Year");
}
    }
    
}
