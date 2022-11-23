import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsDetail {
	public static void main(String[] args) /* throws ArithmeticException */  {	//调用 f2 方法后，main 方法也有一个 throws默认异常处理，程序运行后由 jvm 异常处理
		f2();
	}

	//2.对于运行时异常，程序中如果没有处理，默认就是throws的方式处理
	public static  void f2() /* throws ArithmeticException */ {	//默认的异常处理
		//1.对于编译异常，程序中必须处理，比如 try-catch 或者 throws
		
		int n1 = 10;
		int n2 = 0;
		double res  = n1 / n2;
	}

	//public static void f1() {
	public static void f1() throws FileNotFoundException {
		//为什么调用 f3 报错
		//
		//1。因为f3()方法抛出的是一个编译异常
		//2．即这时，就要f1()必须处理这个编译异常
		//3，在f1()中，要么try-catch-finally ,或者继续throws这个编译异常
		f3();	//抛出异常
	}
	public static void f3() throws FileNotFoundException {
		FileInputStream fis = new FileInputStream("d://a.txt");
	}

	public static void f4() {
		//有没有报错？为什么？
		//1. 在 f4() 中调用方法 f5() 是可以的
		//2. 原因是 f5() 抛出的是运行异常
		//3．而java中，并不要求程序员显示处理，因为有默认处理机制
		f5();
	}
	public static void f5() throws ArithmeticException {
	//public static void f5() throws RuntimeException {		//改另一个异常处理就报错报错

	}
}

class Father {	//父类
	public void method() throws RuntimeException {

	}
}

class Son extends Father {	//子类
	//3.子类重写父类的方法时，对抛出异常的规定：
	//  子类重写的方法，所抛出的异常类型要么和父类抛出的异常一致，
	//  要么为父类抛出的异常的类型的子类型
	@Override
	//public void method() throws NullPointerException {	//可以用父类抛出异常的子类型
	//public void method() throws Exception {	//不可以用比父类高的异常处理
	public void method() throws ArithmeticException {	
		
	}
}
