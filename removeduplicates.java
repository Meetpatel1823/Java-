import java.util.*;
public class removeduplicates {
    public static boolean[] map = new boolean[26];
    public static void removeDuplicates(String str,int index,String newStr)
    {
        if(index==str.length())
        {
            System.out.println(newStr);
            return;
        }
        char curChar=str.charAt(index);
        if(map[curChar-'a']== true)
        {
            removeDuplicates(str, index+1,newStr);

        }
        else{
            newStr+=curChar;
            map[curChar-'a']=true;
            removeDuplicates(str, index+1, newStr);
        }

    }  
    public static void main(String args[])
    {
        String str="abbccddxxx";
        removeDuplicates(str, 0, " ");
    
    }
}
