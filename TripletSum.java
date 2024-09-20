import java.util.*;

public class TripletSum {

    static void TripleSum(int arr[], int key) {
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    if (arr[i] + arr[j] + arr[k] == key) {
                        ans++;
                        System.out.println("triplets are : " + arr[i] + " " + arr[j] + " " + arr[k]);
                    }
                }
            }
        }
        System.out.println(ans + " pairs are found");

    }

    public static void main(String[] args) {
        int arr[] = { 1, 4, 5, 6, 3 };
        int key = 12;
        TripleSum(arr, key);

    }

}
