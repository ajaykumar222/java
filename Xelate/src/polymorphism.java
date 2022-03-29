
public class polymorphism {

	public static void main(String[] args) {
		animal a=new dog();
		a.sound();
		animal b=new chicken();
		b.sound();
		
		
		

	}

}
class animal{
	void sound() {
		System.out.println("The animal is making noise");
	}
}
class dog extends animal{
	void sound() {
		System.out.println("the dog is barking");
	}
}

class chicken extends animal{
public 	void sound() {
		System.out.println("the chicken is chirppping");
	}
}