public class PrimeRange
{
      public static void main(String [] args)
         {
            int count=0,i,j;
            for(j=10;j<=99;j++)
            {
               count=0;
              for(i=1;i<=j;i++)
              {
                 if (j%i==0)
                  count++;
               }
                if (count==2)
                  System.out.println(j);
            }
        }
}