public class RotateSameArr {

    static void swap(int arr[],int i ,int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
      static void Reverse(int arr[],int i,int j)
      {
       
while(i< j)
{
    swap(arr, i, j);
    i++;
    j--;

}

      }
static void RotateInPlace(int arr[],int key)
{
    int n = arr.length;
    key =key % n;
    Reverse(arr, 0, n-key-1);
    Reverse(arr, n-key,n-1);
    Reverse(arr, 0, n-1);

}

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        int key=2;
        RotateInPlace(arr, key);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
            }
            
    }
}
