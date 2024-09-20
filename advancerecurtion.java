import java.util.*;
public class advancerecurtion
{
    public static void printPermutations(String str,String Permutations)
    {
        if(str.length()==0)
        {
            System.out.println(Permutations);
            return;
        }
        for(int i=0;i<str.length();i++)
        {
            char curChar=str.charAt(i);
            String newString = str.substring(0,i) + str.substring(i+1);
            printPermutations(newString, Permutations+curChar);
        }

    }
    public static void main(String args[])
    {
        String str ="abc";
        printPermutations(str, "");

    }
}
