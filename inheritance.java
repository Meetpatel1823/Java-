class Shape
{
    int num1;
    int num2;
    Shape(int num1,int num2)
    {
        this.num2 = num2;
        this.num1 = num1;
    }
    void Area()
    {
        System.out.println("Shape ");
    }
}
class Rect extends Shape{
    Rect(int num1,int num2)
    {
        super(num1, num2);
    }
    void Area()
    {
        System.out.println("Rect : " + (num1+num2));
    }
}
public class inheritance {

    public static void main(String[] args) {
        Shape obj = new Shape(1,3);
        obj.Area();
        Shape obj1 = new Rect(1, 2);
        obj1.Area();
        
    }
    
}
