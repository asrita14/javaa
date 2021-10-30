class TestFinallyBlock
{
    public static void main(String args[])
    {
         try{
            int a = 25/5;
            System.out.println("value of a is:" +a);
            }catch(NullPointerException e){System.out.println("Null ");}
            finally
            {
                System.out.println("Finally Block");
            }
            System.out.println("Rest of prog");
    }
}
