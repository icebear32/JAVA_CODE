public class CodeBlockDetail07 {
	public static void main(String[] args) {
		new BBB();
		//输出的是：
		//AAA 普通代码块...
		//AAA() 构造器被调用...
		//BBB 普通代码块...
		//BBB() 构造器被调用...
	}
}

class AAA {

	{
		System.out.println("AAA 普通代码块...");
	}
	public AAA() {
		//（1）super();
		//（2）调用本类的普通代码块
		System.out.println("AAA() 构造器被调用...");
	}
}

class BBB extends AAA {
	{
		System.out.println("BBB 普通代码块...");
	}
	
        public BBB() {
		//（1）super();
        	//（2）调用本类的普通代码块
                System.out.println("BBB() 构造器被调用...");
        }
}
