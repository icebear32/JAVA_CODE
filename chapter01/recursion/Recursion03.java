public class Recursion03 {
	public static void main(String[] args) {
		T t1 = new T();
		int res = t1.factorial(5);
		System.out.println("res=" + res);		
	}
}

class T {
	//阶乘
	public int factorial(int n) {
		if (n == 1) {
			return 1;
		} else {
			return factorial(n - 1) * n;
		}
	}
}
