public class OverLoad04 {
	public static void main(String[] args) {
		Methods method = new Methods();
		System.out.println(method.max(10, 20));
		System.out.println(method.max(1.1, 2.2));
		System.out.println(method.max(1.1, 2.2, 3.3));
	}
}

/**
 * 2. 在Methods类，定义三个重载方法max()，
 * 第一个方法，返回两个int值中的最大值，
 * 第二个方法，返回两个double值中的最大值，
 * 第三个方法，返回三个double值中的最大值，
 * 并分别调用三个方法。
 *
 * */
class Methods {
	public int max(int n1, int n2) {
		return n1 > n2 ? n1 : n2;
	}

	public double max(double n1, double n2) {
		return n1 > n2 ? n1 : n2;
	}

	public double max(double n1, double n2, double n3) {
		double max = n1 > n2 ? n1 : n2;
		return max > n3 ? max : n3; 
	}
}
