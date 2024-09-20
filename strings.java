 import java.util.*;
public class strings {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        // String name = " meet" ;
        // String fullName= " meet prakashchandra patel";
        // String essay = " this is essay on elephant don't laugh please :) ";
        // String name1= sc.nextLine();
        // System.out.println(name1);
        // String firstName= " meet";
        // String middleName= " Prakashchandra";
        // String lastName= " Patel";

        //  System.out.println((firstName + middleName + lastName).length());
        //  // chatAt
        //  for(int i=0;i<middleName.length();i++)
        //  {
        //     System.out.println(middleName.charAt(i));
        //  }
        // String name1  = " Meet";
        // String name2 = " Meet";
        // if(name1.compareTo(name2)==0)
        //     {
        //     System.out.println(" Strings are equal");
        //     }
        //     else
        //     {
        //    System.out.println(" Strings are not equal");
        //     }
//  "my name is Meet Prakashchandra patel ";
// String name = sentence.substring( 16 , 30);
// System.out.println(name);
// StringBuilder sb= new StringBuilder("tony");
// System.out.println(sb);


// System.out.println(sb.charAt(0));
// sb.setCharAt(0, 'p');
// System.out.println(sb);
// sb.insert(2, 's');
// System.out.println(sb);
StringBuilder sb= new StringBuilder("h");
sb.append('e');
sb.append('l');
sb.append('l');
sb.append('0');
sb.append('w');
System.out.println(sb.length());
for(int i=0;i<=sb.length()/2;i++)
{
   int front = i;
   int back = sb.length() - 1 - i;
   char frontchar = sb.charAt(front);
   char backchar = sb.charAt(back);
   sb.setCharAt(front, backchar);
   sb.setCharAt(back,frontchar); 
}
System.out.println(sb);
        }
    }
    

