
public class PalindromeString {

	public static void main(String[] args) {
		String str="madam";
		String rev="";
		int len=str.length();
		
		for(int i=len-1;i>=0;i--) {
		 rev=rev+str.charAt(i);
		}
		System.out.println(str);
		
       if(rev.equals(str)) {
    	   System.out.println("the string is palindrome  : "+rev);
       }else {
    	   System.out.println("the string is not  a palindrome :"+rev);
       }
	}

}
