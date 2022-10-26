public class Recursion04 {
	public static void main(String[] args) {
		T t1 = new T();
		System.out.println("当 n = 7 对应的斐波那契数 = " + t1.fibonacci(7));		
	}
}

class T {
	/** 用递归的方式求出斐波那契数  */
	public int fibonacci(int n) {
		if (n >= 1) {
			if (n == 1 || n == 2) {
				return 1;
			} else {
				return fibonacci(n - 1) + fibonacci(n - 2);
			}
		} else {
			System.out.println("要求输入 n >= 1 的整数");
			return -1;
		}
	}
}
