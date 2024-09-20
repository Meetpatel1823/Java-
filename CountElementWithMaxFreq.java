import java.util.*;

public class CountElementWithMaxFreq {
   
    public static void SumOfMaxFreqElementsArr(int arr[])
    {
String freqArr[] = new String[arr.length];
int maxFreq = 0;
int maxFreqElement = 0;
String result="";
for(int i = 0; i < arr.length; i++)
{
    int count = 0;
    for(int j = 0; j < arr.length; j++)
    {
        if(arr[i] == arr[j])
        {
            count++;
            }
            }
            result = arr[i]+""+count;

            
            freqArr[i] = result;
            if(count > maxFreq)
            {
                maxFreq = count;
                maxFreqElement = arr[i];
                }
                }

                for(int i = 0;i<arr.length;i++)
                {
                    System.out.print(freqArr[i] + " , ");
                }
            }

                // int sum = 0;
                // for(int i = 0; i < arr.length; i++)
                // {
                //     if(freqArr[i] == maxFreq)
                //     {
                //         sum += arr[i];
                //         }
                //         }
                //         return sum;
                //         }
    public static void main(String[] args) {
        int arr[]={1,2,3,1,3,2};
         SumOfMaxFreqElementsArr(arr);
        System.out.println("Maximum frequency of any element is ");
        
    }
    
}
