public class Method04 {
	public static void main(String[] args) {
		A a = new A();
		a.sayOk();
		a.m1();	
	}
}

class A {
	//同一个类，直接调用
	public void print(int n) {
		System.out.println("print()方法被调用 n=" + n);
	}

	public void sayOk() {	//sayOk调用 print（直接调用）
		print(10);
		System.out.println("继续执行sayOk");
	}

	//跨类中的方法A类调用B类方法:需要通过对象名调用。比如对象名.方法名(参数);
	public void m1() {
		System.out.println("m1()方法被调用");
		//先创建对象
		B b = new B();
		//再调用方法
		b.hi();
		System.out.println("m1()继续执行");
	}
}

class B {
	public void hi() {
		System.out.println("B类中的hi()被执行");
	}
}
