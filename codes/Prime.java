public class Prime
{
	public static void main(String[] args) {
	    int a=Integer.parseInt(args[0]);
		int count=0;
		int i;
		for(i=1;i<=a;i++){
		if(a%i==0){
		count++;
        }
	   }
	   if (count==2){
	       System.out.println(a+" is a prime number");
	   }
	   else{
	       System.out.println(a+" is not a prime number");
	   }
	 }
}