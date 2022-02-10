import java.util.Scanner;

public class permutationand {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		int n, r, ncr; 
		System.out.print("Enter any two numbers-"); 
		n = sc.nextInt(); 
		r = sc.nextInt();
		ncr=fact(n)/(fact(r)*fact(n-r));
		System.out.print("The NCR factor of " + n + " and " + r + " is " + ncr);

	}
public static int fact(int n) {
	int i=1;
	while(n!=0) {
		i=i*n;
		n--;
		
	}return i;
	
}
}
