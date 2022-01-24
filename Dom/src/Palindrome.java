import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int org=n;
		
		int rev = 0;
		while(n!=0) {
			rev=rev*10+n%10;
			n=n/10;
		}
		System.out.println(rev);
     if(rev!=org)
     {
    	 System.out.println("The Entered No is not a palindrome :"+rev);
     }
     else {
    	 System.out.println("The Entered No is a Palindrome:"+rev);
    	 
     }
	}

}
