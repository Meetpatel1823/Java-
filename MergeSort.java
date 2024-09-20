class MergeSort
{
     static void Merge_sort(int arr[],int low,int high)
    {
        if(low<high)
        {
            int mid = (low+high)/2;
            Merge_sort(arr,low,mid);
            Merge_sort(arr,mid+1,high);
            Merge(arr,low,mid,high);
        }
    }

    static void Merge(int arr[],int low,int mid,int high)
    {
        int n1= mid - low + 1;
        int n2 = high - mid;
        int L[] = new int[n1];
        int R[] = new int[n2];
        int i=0,j=0;
      for(i=0;i<n1;i++)
      {
        L[i]=arr[low+i];

      }
      for( j = 0;j<n2;j++)
      {
        R[j]=arr[mid+1+j];
      }
      i=0;j=0;
      int k = low;
      while(i<n1 && j<n2)
      {
        if(L[i]<=R[j])
        {
            arr[k]=L[i];
            i++;
        }else{
            arr[k]=R[j];
            j++;
        }
        k++;
    }
    while(i<n1)
    {
        arr[k]=L[i];
        i++;
        k++;
        }
        while(j<n2)
        {
            arr[k]=R[j];
            j++;
            k++;
            }

}
    public static void main(String[] args) {
        int arr[]= {4,1,2,6,3,5};
        int n = arr.length;
        Merge_sort(arr,0,n-1);
        for(int i = 0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
            }
    }
}