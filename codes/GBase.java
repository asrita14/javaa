class GBase
{
    public final void display(String s)
    {
        System.out.println(s);
    }
}
class Sample extends GBase{
    public void display(String s)
    {
        System.out.println(s);
    }
    public static void main(String args[])
    {
        Sample ob = new Sample();
        ob.display("TRY ME");
    }
}