class A 
{
    int a;
    A()
    {
        a=10;
        System.out.println(" in Class A constructor");
        
    }
}

class B extends A
{
    int b;
    B()
    {
     b = 20;
     System.out.println("in Class B constructor:");
     
    }
}

class ConstructorInheritence
{
    public static void main(String args[])
    {
        B s1=new B();
        System.out.println(s1.a+" "+s1.b);
    }
}