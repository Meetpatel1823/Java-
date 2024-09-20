import java.util.*;

class TargetSum {

    public static void printSum(int arr[], int key) {
        int pair = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == key) {
                    pair++;
                    System.out.println("Pair found: " + arr[i] + " " + arr[j]);

                }
            }
        }
        System.out.println("Total pairs found: " + pair);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the target sum: ");
        int key = sc.nextInt();
        printSum(arr, key);

    }
}