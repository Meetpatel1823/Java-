import java.util.*;
public class occurance {
    public static int first = -1;
    public static int last = -1;
    public static void findOccurance(String str,int idx,int element)
    {
        if(idx==str.length())
        {
          System.out.println(first);
          System.out.println(last);
          return;
        }
        char currentChar = str.charAt(idx);
        if(currentChar==element){
            if(first==-1){
                first=idx;
            }
            else{
                last=idx;
            }
        }
        findOccurance(str, idx+1, element);
    }
    public static void main(String args[])
    {
        String str="abaacbjhvjad";
        findOccurance(str, 0, 'j');
    }
}
