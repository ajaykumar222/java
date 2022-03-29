
public class idec2 {
	static void StringChallenge(String str) {
		boolean a=true;
		boolean b=false;
		String rev="";
		int len=str.length();
		for(int i=len-1;i>=0;i--) {
			 rev=rev+str.charAt(i);
			}
			
	       if(str.equals(rev)) {
	    	   
	    	   System.out.println(a);
	    	   
	       }else {
	    	   System.out.println(b);
	    	  
	       }
		}

	public static void main(String[] args) {
		String str="eye";
		StringChallenge(str);
		}}
