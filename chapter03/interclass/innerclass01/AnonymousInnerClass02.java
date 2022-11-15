public class AnonymousInnerClass02 {
	public static void main(String[] args) {
		Outer07 outer07 = new Outer07();
		outer07.method();
	}
}

class Outer07 {	//外部类
	private int n1 = 10;
	public void method() {	//方法
		//基于接口的匿名内部类
		//1.需求:想使用IA接口,并创建对象
		//2.传统方式，是写一个类，实现该接口,并创建对象
		//3.需求是 Tiger 类只是使用一次，以后再不使用
		//IA tiger = new Tiger();
		//tiger.cry();
		//
		//4.可以使用匿名内部类来简化开发
		//5.tiger 的编译类型是什么？
		//	IA
		//
		//6.tiger 的运行类型是什么？
		//	就是匿名内部类 => XXXX => Outer07$1
		//	匿名内部类的名字是用外部类的名称加个$
		/**
 		 *	底层，底层会分配 类名 Outer07$1
 		 *	class Outer07 implements IA {
 		 *
 		 * 	匿名内部类用一次就没有了
 		 *
 		 *	class XXXX implements IA {
 		 *		@Override
 		 *		public void cry() {
 		 *			
 		 *		}
 		 *	}
 		 */ 
		//
		//7.jdk 底层在创建匿名内部类 Outer07$1，
		//  立即马上就创建了 Outer07$1 实例，并且把地址
		//  返回给 tiger
		//
		//8.匿名内部类使用一次，就不能再使用
		//  但是 tiger 可以继续使用，不能使用的是 匿名内部类，用完就不存在了
		IA tiger = new IA() {
			@Override
			public void cry() {
				System.out.println("老虎叫唤...");
			} 
		};
		System.out.println("tiger 的运行类型 = " + tiger.getClass());	//tiger 的运行类型 = class Outer07$1
		tiger.cry();
		//匿名内部类使用完，tiger 继续调用
		tiger.cry();
		tiger.cry();
		tiger.cry();
	}
}

interface IA {	//接口
	public void cry();
}
