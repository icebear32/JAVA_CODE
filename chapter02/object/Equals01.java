public class Equals01 {
	public static void main(String[] args) {
		A a = new A();
		A b = a;
		A c = b;
		System.out.println(a == c);	//true
		System.out.println(b == c);	//true
	
		B bObj = a;
		System.out.println(bObj == c);	//true
	}
}

class B {}

class A extends B {}
