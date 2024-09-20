import java.util.*;

class Student
{
int age;
 String name;

 public void printName()
 {
    System.out.println(this.name);
    System.out.println(this.age);

 }


}



public class oops1 {

    public static void main(String args[])
    {
       Student s1 = new Student();
       s1.name = "MEET PRAKASHCHANDRA PATEL";
       s1.age = 19;
       s1.printName();
    }
    
}
