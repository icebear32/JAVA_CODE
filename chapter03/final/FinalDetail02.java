public class FinalDetail02 {
	public static void main(String[] args) {
		//System.out.println(BBB.num);
		//没有加上 final 时，
		//输出的是：
		//BBB 静态代码块被执行
		//10000
		//
		//加上 final 后
		System.out.println(BBB.num);
		//输出的是：
		//10000
		//因为 final 和 static 的使用 不会 导致类的加载
		//也就不会输出代码块的内容
		//直接输出属性 num = 1000
	}
}

//final和static往往搭配使用，效率更高，不会导致类加载，底层编译器做了优化处理
class BBB {
	public final static int num = 10000;

	static {
		System.out.println("BBB 静态代码块被执行");
	}
}

final class AAA {
	//一般来说，如果一个类已经是 final 类了，
	//就没有必要再将方法修饰成 final 方法
	//public final void cry() {}
}
