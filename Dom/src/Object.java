
public class Object {
	
	
	
	public void add(int a,int b)
	{
		System.out.println(a+b);
	}
	
	public void sub(int a,int b)
	{
		System.out.println(a-b);
	}
	
	public void Mul(int a,int b)
	{
		System.out.println(a*b);
	}
	public void div(int a, int b)
	{
		System.out.println(a/b);
	}

	public static void main(String[] args) {
		
		Object a=new Object();
		a.add(20, 30);
		a.Mul(30, 56);
		a.div(30, 6);
		

	}

}
