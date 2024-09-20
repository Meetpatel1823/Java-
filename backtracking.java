import java.util.*;
public class backtracking {
    public static void printPermutations(String str,String per,int index)
{
for(int i=0;i<str.length();i++)
{
    char curChar=str.charAt(i);
    String newString=str.substring(0,i) +str.substring(i+1);

    printPermutations(newString, per+curChar, index+1);

}
}   
 public static void main(String args[])
    {
        String str = "ABC";

    }
    
}
