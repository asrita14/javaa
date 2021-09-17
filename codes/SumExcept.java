public class SumExcept
{
   public static void main(String [] args)
      {
        int [] arr={10,3,6,1,2,7,9};
        int flag=0,sum=0;
        for(int i:arr)
         {
           if(i==6)
              flag=1;
          if(flag==1)       
            {
               if(i==7)
                  flag=0;
            continue;
            }
           else
           {
                if(i==7) 
                  sum=sum+i+6;
                else
                  sum=sum+i;
            }
           }
             System.out.println("Sum = " + " " + sum);
         }
}
