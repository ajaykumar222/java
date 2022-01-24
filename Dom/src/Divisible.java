import java.util.Scanner;

public class Divisible {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in); //System.in is a standard input stream.
		System.out.print("Enter first number- ");
		int a= sc.nextInt();
		int b=a%9;
		int c =a%7;
		
		if(b==0 || c==0) {
			System.out.println("The no is divisible by 7 and 9 ");
			
					
			
		}else {
			System.out.println("the no is not divisable by 9 or 7 ");
		}

	}

}
