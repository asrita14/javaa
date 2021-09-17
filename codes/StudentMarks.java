import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class StudentMarks
{
   public static void main(String [] args) throws IOException
    {
       int i=0;
       System.out.println("Enter Student name : ");
       InputStreamReader isr=new InputStreamReader(System.in);
       BufferedReader reader=new BufferedReader(isr);
       String name=reader.readLine();
       System.out.println("Enter the marks in five subjects : ");
       String s1=reader.readLine();
       int subject1=Integer.parseInt(s1);
       String s2=reader.readLine();
       int subject2=Integer.parseInt(s2);
       String s3=reader.readLine();
       int subject3=Integer.parseInt(s3);
       String s4=reader.readLine();
       int subject4=Integer.parseInt(s4);
       String s5=reader.readLine();
       int subject5=Integer.parseInt(s5);
       int sum;
       float avg;
       sum=subject1+subject2+subject3+subject4+subject5;
       avg=(float)sum/5;
       System.out.println("Student name is " + name + " and average is " + avg);
       
     }
}