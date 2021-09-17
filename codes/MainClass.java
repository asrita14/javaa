class subClass
{
 String msg="Hello Welocome to classes";
 void disp()
 {
     System.out.println(msg);
 }
}
class MainClass
{
    public static void main(String args[])
    {
    subClass sc=new subClass();
    sc.disp();
    }
}