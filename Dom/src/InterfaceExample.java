interface A{
	void a();
	void b();
	void c();
	void d();
}

abstract class B implements A{
public 	void b() {
		System.out.println("I am Studying");
	}
}
public class InterfaceExample extends B{

	public 	void c() {
		System.out.println("I am Studying");
	}
	public 	void d() {
		System.out.println("I am Studying");
	}
	@Override
	public void a() {
		System.out.println("My name  is ajay");
	}
	

	public static void main(String[] args) {
  A aaa=new InterfaceExample();
  aaa.a();
  aaa.b();
  aaa.c();
  aaa.d();

	}

}
