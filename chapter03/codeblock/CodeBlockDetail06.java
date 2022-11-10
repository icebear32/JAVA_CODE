public class CodeBlockDetail06 {
	public static void main(String[] args) {
		//调用构造方法
		C c = new C();
		//输出的是：
      		//C getN1 被调用...
		//C 静态代码块01
		//C getN2 被调用...
		//C 普通代码块01
		//C 无参构造器 被调用...
	}
}

class C {
	//静态属性的初始化
	private static int n1 = getN1();
	
	static {	//静态代码块
		System.out.println("C 静态代码块01");
	}

	public static int getN1() {	//静态方法	
		System.out.println("C getN1 被调用...");
		return 100;
	}
	
	//普通属性/非静态属性的初始化
	private int n2 = getN2();
	
	{	//普通代码块
		System.out.println("C 普通代码块01");
	}

	public int getN2() {	//普通方法/非静态方法
		System.out.println("C getN2 被调用...");
		return 100;
	}

	//构造器
	public C() {
		System.out.println("C 无参构造器 被调用...");
	}
}

