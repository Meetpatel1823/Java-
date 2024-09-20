public class BinarySearch {

    public static int BinarySearchArray(int arr[],int low,int high,int key)
    {
        int mid = (low + high ) / 2;

        while(low<=high)
        {
            if(arr[mid]==key)
            {
                return mid;
            }
            else if(arr[mid]>key)
            {
                return BinarySearchArray(arr,0,mid,key);
            }else{
               return BinarySearchArray(arr,mid+1,high,key);
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]= {1,3,4,2,5,7,6};
        int key = 7;
        int result = BinarySearchArray(arr,0,arr.length,key);
        if(result==-1)
        {
            System.out.println("Element is not present in array");
            }
            else
            {
                System.out.println("Element is present at index " + result);
            }
    }
}
