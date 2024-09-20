import java.util.*;
public class swapAB {

    static void swapNum(int a ,int b)
    {
        System.out.println("Values before swap : " + a + " " +b);
        int temp = a;
        a=b;
        b=temp;
        System.out.println("Valued after Swap : " + a + " " + b);


    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 3;
        int b = 9;
        int arr[]= {1,2,4,5,6};
        swapNum(a,b);

    }
}
