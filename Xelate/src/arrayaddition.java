
public class arrayaddition {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};
		int average,total=0;
		for(int a:arr) {
			total=total+a;
		}
System.out.println(total);
average=total/arr.length;
System.out.println(average);

	}

}
