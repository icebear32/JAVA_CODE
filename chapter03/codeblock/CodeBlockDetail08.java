public class CodeBlockDetail08 {
	public static void main(String[] args) {
		// 父类的静态代码块和静态属性(优先级一样,按定义顺序执行)
		// 子类的静态代码块和静态属性(优先级一样,按定义顺序执行)
		// 父类的普通代码块和普通属性初始化(优先级一样,按定义顺序执行)
		// 父类的构造方法
		// 子类的普通代码块和普通属性初始化(优先级一样，按定义顺序执行)
		// 子类的构造方法
		new B02();	//对象
		//运行后顺序 (1) - (10)
	}
}

class A02 {
	private static int n1 = getVal01();

	static {
		System.out.println("A02 的一个静态代码块...");	//（2）
	}

	{
		System.out.println("A02 的一个普通代码块...");	//（5）
	}

	public int n3 = getVal02();

	public static int getVal01() {
		System.out.println("getVal01");	//（1）
		return 10;
	}

	public static int getVal02() {
		System.out.println("getVal02");	//（6）
		return 10;
	}

	public A02() {	//构造器
		//隐藏
		//super();
		//普通代码块和普通属性的初始化
		System.out.println("A02 的构造器");	//（7）
	}
}

class B02 extends A02 {	//子类继承父类
	private static int n3 = getVal03();

        static {
                System.out.println("B02 的一个静态代码块...");	//（4）
        }

	public int n5 = getVal04();

        {
                System.out.println("B02 的一个普通代码块...");	//（9）
        } 
 
        public static int getVal03() {	
                System.out.println("getVal03");	//（3）
                return 10;
        }

	public int getVal04() {	
		System.out.println("getVal04");	//（8）
		return 10;
	}

        public B02() {
	//隐藏
	//super();
	//普通代码块和普通属性的初始化
                System.out.println("B02 的构造器");	//（10）
        }
}

class C02 {
	private int n1 = 100;
	private static int n2 = 200;

	private void m1() {
		
	}

	private static void m2() {

	}

	static {
		//静态代码块，只能调用静态成员
		// System.out.println(n1);	//错误
		System.out.println(n2);	//可以
		//m1();	//错误
		m2();	//可以
	}

	{
		//普通代码块，可以使用任意成员
		System.out.println(n1);	//可以
		System.out.println(n2);	//可以
		m1();	//可以
		m2();	//可以
	}
}
