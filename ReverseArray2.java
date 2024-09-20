import java.util.*;
class ReverseArray2
{
   static void swarInArr(int arr[],int i,int j)
    {
       
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
  static  void ReverseArr(int arr[])
    {
        int i=0;    
        int j=arr.length-1;
        while(i<=j-1)
        {
            swarInArr(arr,i,j);
            i++;
            j--;
            }   
    }
    static void printArr(int arr[])
    {
        int n = arr.length;
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
            
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        printArr(arr);
        System.out.println();
ReverseArr(arr);
System.out.println("Reverse Array is:");
printArr(arr);
    }

}