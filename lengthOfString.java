public class lengthOfString{

    public static void main(String args[])
    {

        String str= "Hello";
        int count = 0;
        for(char c : str.toCharArray())
        {
            count ++;
        }
        System.out.println("count is " + count);
    }
    
}
