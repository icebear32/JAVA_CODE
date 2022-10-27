public class OverLoad02 {
	public static void main(String[] args) {
		MyCalculator mc = new MyCalculator();
		
		System.out.println(mc.calculate(1, 2));
		
		System.out.println(mc.calculate(1, 2.2));
		
		System.out.println(mc.calculate(1.1, 2));
		
		System.out.println(mc.calculate(1, 2, 3));
			
	}
}

class MyCalculator {
	//两个整数的和
	public int calculate(int n1, int n2) {
		System.out.println("public int calculate(int n1, int n2) 被调用");
		return n1 + n2;
	}
	
	//一个整数，一个double的和
	public double calculate(int n1, double n2) {
		System.out.println("public int calculate(int n1, double n2) 被调用");
		return n1 + n2;	
	}

	//一个double，一个int的和
	public double calculate(double n1, int n2) {
		System.out.println("public int calculate(double n1, int n2) 被调用");
		return n1 + n2;
	}

	//三个int的和
	public int calculate(int n1, int n2, int n3) {
		System.out.println("public int calculate(int n1, int n2, int n3) 被调用");
		return n1 + n2 + n3;
	}
}
