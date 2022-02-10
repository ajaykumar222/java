import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Stack;
import java.util.TreeSet;
import java.util.Vector;

public class collection {

	public static void main(String[] args) {
	Vector<Integer> a=new Vector();
HashMap<Integer,String> b=new HashMap();
ArrayList<Integer> d=new ArrayList();
Stack<String> stack = new Stack<String>();
TreeSet<String> ts = new TreeSet<String>();

stack.push("Geeks");
stack.push("For");
stack.push("Geeks");
stack.push("Geeks");
System.out.println(stack.peek());

Iterator<String> it= stack.iterator();
while (it.hasNext()) {
    System.out.println(it.next());
}

d.add(37);
 
int[] g= {1,2,3};
a.add(20);
Collections.sort(d);

b.put(34,"ajay");

for (int i = 0; i < a.size(); i++)
    System.out.print(a.get(i) + " ");


	}

}
