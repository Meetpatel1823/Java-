import java.util.*;
public class revstr {
    public static void strRev(String str,int index)
    {
        if(index==0)
        {
            System.out.println(str.charAt(index));
            return;

        }
        System.out.print(str.charAt(index));
        strRev(str, index-1);

    }
    public static void main(String args[])
    {
        String str="abcd";
        strRev(str, str.length()-1);

    }
}
