public class Reverse
{
	public static void main(String[] args) {
		int n=Integer.parseInt(args[0]);
		int number=0;
		int rem;
		while (n!=0){
		    rem=n%10;
		    number=(number*10)+rem;
		    n=n/10;
		}
		System.out.println("Reversed number is : " + number);
	}
}
