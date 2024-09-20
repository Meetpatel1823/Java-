import java.util.*;
import java.io.*;
class armInRange
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    
        int a = sc.nextInt();
        int b = sc.nextInt();
        int temp;
int count = 3;
        while (a < b) {
            temp = a;
            int arm = 0;
            
            {

                while (temp != 0) {
                    int rem = temp % 10;
                    arm = arm +(int)Math.pow(rem, count);
                    temp = temp / 10;
                }
                if (arm == a) {
                    System.out.println(a);
                }
            }
            a++;
        }


        
    }
}