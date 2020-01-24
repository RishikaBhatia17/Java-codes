class A
{
    public void methodA()
    {
        System.out.println("my name is rishika");
    }
	
}

class B extends A
{
    public void methodB()
    {
        System.out.println("my name is sakshi");
    
    }
}
class C extends A
{
   public void methodC()
    {
        System.out.println("my name is ishika");
    }
}
class D extends B
{
    public void methodD()
    {
        System.out.println("my name is janvi");
    }
}

class multiple threads
{
public static void main(String args[])
{
   A obj1 = new A();
   B obj2 = new B();
   C obj3 = new C(); 
   D obj4 = new D();  
     obj1.methodA();
     obj2.methodB();
     obj3.methodC();
     obj4.methodD();
  }
}
