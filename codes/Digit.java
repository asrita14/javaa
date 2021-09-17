import java.util.Scanner;
public class Digit {
 
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("write your name");
        String s3 = new String(sc.nextLine());
        int digits = 0;
        for (int i = 0; i < s3.length(); i++) {
            if (s3.charAt(i) >= 48 && s3.charAt(i) <= 57)
                digits++;
        }
        System.out.println("Total number of Digits = "
                           + digits);
    }
}