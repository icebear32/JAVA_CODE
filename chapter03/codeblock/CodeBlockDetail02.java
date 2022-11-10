public class CodeBlockDetail02 {
	public static void main(String[] args) {
		//static代码块，是在类加载时执行的，而且只会执行一次
		CC cc1 = new CC();
		CC cc2 = new CC();
		//只输出一次代码块：
		//CC 的静态代码块1 被执行...
	}
}

class CC {
	//静态代码块
	static  {
		System.out.println("CC 的静态代码块1 被执行...");
	}		
}
