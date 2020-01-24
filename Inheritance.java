class SingleInheritance
{
    void()
    {
        System.out.println(my name is rishika);
    }
	
}

class B extends SingleInheritance
{
    void()
    {
        System.out.println(my name is sakshi);
    
    }
}
class C extends SingleInheritance
{
    void()
    {
        System.out.println(my name is ishika);
    }
}
class D extends B
{
    void()
    {
        System.out.println(my name is janvi);
    }
}
public static void main(String args[])
{
    D object = new D();
    obj.methodA();
    obj.methodB();
    obj.methodC();
    obj.methodD();
  }
}
