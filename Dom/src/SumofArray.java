import java.util.Arrays;

public class SumofArray {

	public static void main(String[] args) {
		int[] a= {1,2,80,20,70,50,100};
		Arrays.sort(a);
		int largest =0;
	for(int i=0;i<a.length;i++) {
		for(int j=1;j<a.length;j++) {
			
		
		if(a[i]>a[j]) {
			
			largest=a[i];
			
		}else {
			a[i]=a[j];
		}
		}
		
	}System.out.println(largest);
	}

}
