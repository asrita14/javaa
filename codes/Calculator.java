class Calculatoradd
{
    int add(int a, int b)
    {
        int c;
        c= a+b;
        return c;
    }
}
class Calculatorsub
{
    int sub(int a, int b)
    {
        int d;
        d= a-b;
        return d;
    }
}
class Calculatordiv
{
    int div(int a, int b)
    {
        int e;
        e= a/b;
        return e;
    }
}
class Calculatormul
{
    int mul(int a, int b)
    {
        int f;
        f= a*b;
        return f;
    }
}


class Calculator
{
    public static void main(String[] args)
    {
        Calculatoradd calc= new Calculatoradd();
        int sum=calc.add(10,20);
        System.out.println("Sum of 10 and 20 is:"+sum);
        Calculatorsub cal= new Calculatorsub();
        int dum=cal.sub(10,20);
        System.out.println("subtraction of 0 and 20 is:"+dum);
        Calculatordiv val= new Calculatordiv();
        int vum=val.div(10,20);
        System.out.println("division of 10 and 20 is:"+vum);
        Calculatormul nal= new Calculatormul();
        int rum=nal.mul(10,20);
        System.out.println("multipliction of 10 and 20 is:"+rum);
    }
    
}