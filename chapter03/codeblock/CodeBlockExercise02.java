public class CodeBlockExercise02 {
	public static void main(String[] args) {
		Test a = new Test();	//无参构造器
		//输出的是：
		//静态成员 sam 初始化
		//static 块执行
		//sam1成员初始化
		//Test 默认构造函数被调用
	}
}

class Test {
	Sample sam1 = new Sample("sam1成员初始化");	//3
	static Sample sam = new Sample("静态成员 sam 初始化");	//1

	static {
		System.out.println("static 块执行");	//2
		if (sam == null)
			System.out.println("sam is null");
	}

	Test() {
		System.out.println("Test 默认构造函数被调用");	//4
	}
}

class Sample {
	Sample(String s) {
		System.out.println(s);	//1 3（跳转）
	}

	Sample() {
		System.out.println("Sample 默认构造函数被调用");
	}
}
