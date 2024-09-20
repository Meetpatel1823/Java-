import java.util.*;
public class substrings {
    public static void main(String args[])
    {
        String str = "ABC";
        String newStr = str.substring(0,2) + str.substring(2+1);
        System.out.println(newStr);

    }
}
