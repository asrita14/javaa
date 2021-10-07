class Person 
{
    void message()
    {
        System.out.println("this is person class");
        
    }
}
class Student extends Person
{
    void message()
    {
        System.out.println(" this is student class");
    }
    void display()
    {
            message();
            super.message();
    }
}
class SuperEx 
{
    public static void main(String args[])
    {
        Student s=new Student();
            Person p = new Person();
            p.message();
            s.display();
            s.message();
    }
}