
public class QuickSort {

    void Swap(int arr[],int i,int j)
    {
        int temp = arr[i];
        arr[i]= arr[j];
        arr[j]= temp;
    }
  int partition(int arr[],int low,int high)
  {
    int pi = arr[high];
    int i = (low - 1);
for(int j = low;j<high;j++)    {
        if(arr[j]<=pi)
        {
            Swap(arr,i,j);
            i++;
            }
            Swap(arr,i+1,high);
            return i+1;
    }
    
    return pi;
  }
    void QuickSort(int arr[],int low ,int high)
    {

    }

public static void main(String[] args) {
    
}    
}
