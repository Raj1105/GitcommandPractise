package javaPractise;

class n{
	
	public n() {
		System.out.println("default constructor");
	}
	
	public n(int n) {
		System.out.println("parametrized constructor");
	}
	
	}

class b extends n{
	
	public b() {
		
		System.out.println("default child constructor");
	}
	
	public b(int a) {
		super(a);
		
		
		System.out.println("parametrized child constructor");
	}
	
}



public class SuperAndThis {
	
	
	
	public static void main(String[] args) {
		b oj = new b(6);

	}

}
