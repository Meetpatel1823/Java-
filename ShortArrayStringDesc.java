import java.util.*;
class StringShorter
{
    public void sortDescending(String arr[])
    {
        Arrays.sort(arr);
        reverse(arr);
    }
    void reverse(String arr[])
    {
        int left = 0;
        int right = arr.length-1;
        while(left<right)
        {
            String temp = arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
    }

}
public class ShortArrayStringDesc {
    public static void main(String[] args) {
        
    }
    
}
