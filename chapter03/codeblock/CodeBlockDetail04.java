public class CodeBlockDetail04 {
	public static void main(String[] args) {
		//调用静态代码块和静态属性初始化
		//（注意:静态代码块和静态属性初始化调用的优先级一样，
		//如果有多个静态代码块和多个静态变量初始化，
		//则按他们定义的顺序调用）
		//
		A a = new A();
		//输出的是：
		//getN1 被调用...
		//A 静态代码块01
		//
		//调换静态属性和静态代码块的位置会发生什么? 
		Aa aa = new Aa();
		//输出的是：		    
                               //Aa 静态代码块01
	              //Aa 的 getN1 被调用...
	}
}

class A {
	//静态属性的初始化
	private static int n1 = getN1();
	
	static {	//静态代码块
		System.out.println("A 静态代码块01");
	}

	public static int getN1() {
		System.out.println("getN1 被调用...");
		return 100;
	}	
}

/* 调换静态属性和静态代码块的位置会发生什么? */
class Aa {
	static {	//静态代码块
		System.out.println("Aa 静态代码块01");
	}
	
	//静态属性的初始化
	private static int n1 = getN1();

	public static int getN1() {
		System.out.println("Aa 的 getN1 被调用...");
		return 100;
	}	
}

