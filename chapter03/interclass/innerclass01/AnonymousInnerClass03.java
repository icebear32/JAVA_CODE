public class AnonymousInnerClass03 {
	public static void main(String[] args) {
		Outer07 outer07 = new Outer07();
		outer07.method();
	}
}

class Outer07 {	//外部类
	private int n1 = 10;
	public void method() {
		//演示基于类的匿名内部类
		//分析：
		//	1.father 编译类型 Father
		//	2.father 运行类型 Outer07$2
		//	3.底层会创建匿名内部类
		/**
 		 *	class Outer07$2 extends Father {//类和类的关系，就是继承不是实现了
 		 *		//因为 Father 类已经有构造器、有实现好的方法
 		 *		//所以匿名内部类什么也不写也是可以的
 		 *	}
 		 */
		//
		//4.同时也直接返回了 匿名内部类 Outer07$2的对象
		//5.注意 ("jack") 参数列表会传递给 构造器
		Father father = new Father("jack") {
			//匿名内部类中不可以写构造器

			@Override
			public void test() {
				System.out.println("匿名内部类重写了 test 方法");
			}	
		};
		System.out.println("father 对象的运行类型 = "  + father.getClass());	//Outer07$2
		
		Father father1 = new Father("tom");
		System.out.println("father1 对象的运行类型 = "  + father1.getClass());	//Father
		
		System.out.println("===============================");
		father.test();

		//基于抽象类的匿名内部类
		Animal animal = new Animal() {	//抽象类的方法必须实现，不然提示报错
			@Override
			void eat() {
				System.out.println("小狗吃骨头...");
			}
		};
		animal.eat();
	}
}

class Father {	//普通类
	public Father(String name) {	//构造器
		System.out.println("接收到 name = " + name);
	}

	public void test() {	
	}
}

abstract class Animal {	//抽象类
	abstract void eat();
}
