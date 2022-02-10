
abstract class Abstractexample{
abstract void method();
public class animal extends  Abstractexample{
	void method() {
		System.out.println("hello world");
	}
	public static void main(String[] args) {
		Abstractexample ajay=new animal();
		ajay.method();
		
		
		
	}

}
}
