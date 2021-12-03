package java;

public class Thisexample {
	int c;
	int d;
	
	void setData(int a,int b)
	{
		this.c =a;
		this.d=b;
	}

	public static void main(String[] args) {
		Thisexample t = new Thisexample();
		t.setData(10, 12);
		System.out.println(t.c);
		System.out.println(t.d);
		
		
	}

}
