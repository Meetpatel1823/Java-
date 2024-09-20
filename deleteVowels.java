public class deleteVowels {
    public static void main(String args[])
    {
        String str = "Meet Patel";
        String newStr="";
        for(char ch:str.toCharArray())
        {
            if(ch=='a' || ch=='A' || ch=='e' || ch=='E' || ch=='i' || ch=='I' || ch=='o' || ch=='O' || ch=='u' || ch=='U')
            {
               newStr = newStr ;
            }
            else
            {
                 newStr = newStr + ch;
            }
        }

        System.out.println(newStr);  // Output : Mt Ptl
    }
}
