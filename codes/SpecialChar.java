public class SpecialChar
{ 
   public static void main(String [] args)
      {
        char a='@';
        if ((a>='a' & a<='z') |(a>='A' & a<='Z'))
           System.out.println("Alphabet");
        else if(a>=0 & a<=9)
            System.out.println("Digit");
         else
               System.out.println("Special Character");
        }
}
