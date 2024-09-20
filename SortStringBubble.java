class sort{
     public static String[] BubbleSort(String[] arr)
    {
        int  n  = arr.length;
        for(int i = 0;i<n-1;i++)
        {
            for(int j = 0;j<n-i-1;j++)
            {
                if(arr[j].compareTo(arr[j+1])>0)
                {
                    String temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }
}
class SortStringBubble
{
    public static void main(String[] args) {
        String[] arr = {"dog","cat","apple","banana","elephant"};

        sort s = new sort();
        String s1[] = s.BubbleSort(arr);
for(int i = 0 ;i< arr.length-1;i++)
{
System.out.print(s1[i] + ">-");
}
    }
}