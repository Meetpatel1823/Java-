import java.util.*;
public class subsequence {
    public static void subSequences(String str,int index,String newstr)
    {
        if(index==str.length())
        {
            System.out.println(newstr);
            return;
        }
         char curChar=str.charAt(index);
         // to be
         subSequences(str,index+1,newstr+curChar);
         //ro mot  to be
subSequences(str,index+1,newstr);
    }
    public static void main(String args[])
    {
        String str ="abcd";
        
        subSequences(str,0," ");
     
    }
}
