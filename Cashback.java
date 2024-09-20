class Flipcart
{
    String p_name;
    int p_price;
    void set(String p_name ,int p_price)
    {
        this.p_price = p_price;
        this.p_name=p_name;
    }
    int CountCashback()
    {
        int cash_back = p_price > 5000 ? 50 : 100;
        int sum_cashback = (p_price/1000) * cash_back;
        return sum_cashback;
    }
    void printDetails()
    {
        int cb = CountCashback();
        System.out.println(" "+ p_name + " " + p_price + " " + cb);
    }
    
}
public class Cashback {
    public static void main(String[] args) {
        Flipcart f = new Flipcart();
        f.set("Flipkart", 1000);
       int n= f.CountCashback();
        f.printDetails();

        
    }
    
}
