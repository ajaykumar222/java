import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class iterator {

	public static void main(String[] args) {
		ArrayList<String> arr= new ArrayList<String>();
		arr.add("Ajay");
		arr.add("Naveen");
		arr.add("Deva");
		arr.add("Saravana");
		Collections.sort(arr);
		Iterator<String> ittr=arr.iterator();
		while(ittr.hasNext()) {
			System.out.println(ittr.next());
		}

	}

}
