import java.util.Scanner;

class A
{
    protected static int x = 7;

}
class B extends A
{
    static int x = 6;
    void display()
    {
        System.out.println("hello" + x + "hi" + super.x);
    }
}
class assignment9
{
    public static void main(String[] args)
    {
        B obj= new B();
        obj.display();
    }
}
