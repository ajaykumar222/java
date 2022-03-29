
public class Xelate extends A1{

	public static void main(String[] args) {
		A1 o=new A1();
		System.out.println(o.a);
		System.out.println(o.b);
		Xelate n=new Xelate();
		System.out.println(n.a);
		System.out.println(n.b);
		
		

	}

}
class A1 extends A2{
	int a=30;
}
class A2 {
	int b=30;
}