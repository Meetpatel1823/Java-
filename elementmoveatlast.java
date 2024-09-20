import java.util.*;
public class elementmoveatlast {
    public static void moveAllX(String str,int index,int count,String newString)
    {
        if(index==str.length())
        {
           for(int i=0;i<count;i++)
           {
            newString=newString + 'x';
           }
            System.out.println(newString);
            return;
        }
        char currChar = str.charAt(index);
        if(currChar=='x')
        {
            count++;
            moveAllX(str, index+1, count, newString);
        }
        else{
            newString=newString+currChar;
            moveAllX(str, index+1, count, newString);
        }
    }
    public static void main(String args[])
    {
        String str = " abxxjshxdx";
        moveAllX(str, 0, 0," ");

    }
}
