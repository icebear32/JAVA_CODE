public class OverLoad03 {
	public static void main(String[] args) {
		Methods method = new Methods();
		method.m(10);
		method.m(10,10);
		method.m("hello world");		
	}
}

/**
 * 1. 编写程序，类Methods中定义三个重载方法并调用。
 * 方法名为m。三个方法分别接收一个int参数、两个int参数、一个字符串参数。
 * 分别执行平方运算并输出结果，相乘并输出结果，输出字符串信息。
 * 在主类的main ()方法中分别用参数区别调用三个方法。
 * */
class Methods {
	public void m(int n) {
		System.out.println("平方 = " + (n * n));
	}

	public void m(int n1, int n2) {
		System.out.println("相乘 = " + (n1 * n2));
	}
	
	public void m(String str) {
		System.out.println("传入的 str = " + str);
	}
}
