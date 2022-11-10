public class CodeBlockDetail05 {
	public static void main(String[] args) {
		//调用普通代码块和普通属性的初始化
		//(注意:普通代码块和普通属性初始化调用的优先级一样,
		//如果有多个普通代码块和多个普通属性初始化，则按定义顺序调用)
		//
		B b =new B();
		//输出的是：
		//getN2 被调用...
		//B 普通代码块01

		Bb bb =new Bb();
		//输出的是：
		//Bb 普通代码块01
		//Bb getN2 被调用...
	}
}

class B {
	//普通属性/非静态属性的初始化
	private int n2 = getN2();
	
	{	//普通代码块
		System.out.println("B 普通代码块01");
	}

	public int getN2() {	//普通方法/非静态方法
		System.out.println("getN2 被调用...");
		return 100;
	}	
}

class Bb {
	{	//普通代码块
		System.out.println("Bb 普通代码块01");
	}
	//普通属性/非静态属性的初始化
	private int n2 = getN2();

	public int getN2() {	//普通方法/非静态方法
		System.out.println("Bb getN2 被调用...");
		return 100;
	}
}

