package javaPractise;

public class checkstaticMethod {

	
static int m = 6;
	public static void main(String[] args) {
		m = 10;
		number(m);
		System.out.println(m);
		
	

	}
	//updating code in master branch
	public static  void number(int a) {
		
		m = 12;
		System.out.println(m);
		
	}
	
	

		

}
