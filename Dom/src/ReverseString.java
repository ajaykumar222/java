import java.io.*;
import java.util.Scanner;
public class ReverseString {

	public static void main(String[] args) {
     String str = "abcde";
     System.out.println(str);
     String rev="";
     int len=str.length();
     for(int i=len -1;i>=0;i--)
     {
    	 rev=rev+str.charAt(i);
     }
System.out.println(rev);
	}
}

