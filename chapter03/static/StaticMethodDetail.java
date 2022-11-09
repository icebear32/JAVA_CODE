public class StaticMethodDetail {
	public static void main(String[] args) {
		D.hi();	//可以
		//非静态方法，不能通过类名调用
		//D.say();	//报错，需要先创建对象，再调用
		D d = new D();
		d.say();
	}
}

class D {
	private int n1 = 100;
	private static int n2 = 200;

	public void say() {	//非静态方法，普通方法
		
	}

	public static void hi() {	//静态方法，类方法
		//类方法中不允许使用和对象有关的关键字，
		//比如this和super。普通方法(成员方法)可以	
		//System.out.println(this.n1);
	}

	//类方法(静态方法)中只能访问静态变量或静态方法
	public static void hello() {
		System.out.println(n2);
		System.out.println(D.n2);
		//System.out.println(this.n2);	//不能使用
		hi();	//可以
		//say();	//错误
	}

	//普通成员方法，既可以访问非静态成员，也可以访问静态成员
	public void ok() {
		//非静态成员
		System.out.println(n1);	//非静态属性
		say();	//非静态方法

		//静态成员
		System.out.println(n2);	//静态属性
		hello();	//静态方法
	}
}
