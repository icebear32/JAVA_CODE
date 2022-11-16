public class AnonymousInnerClassDetail01 {
	public static void main(String[] args) {
		Outer01 outer01 = new Outer01();
		outer01.hi();
	}
}

class Outer01 {
	private int n1 = 99;
	public void hi() {
		//创建一个基于类的匿名内部类
		Person p = new Person() {
			@Override
			public void hi() {
				System.out.println("匿名内部类重写了 hi方法");
			}
		};
		p.hi();	//动态绑定机制，找到匿名内部类里面的 hi 方法
		//运行类型是 Outer01$2，不是 Person 类的 hi 方法
		//因为匿名内部类重写了 hi 方法
		//要是不重写的话，就按类的继承关系来
		//
		//也可以直接调用，匿名内部类本身也是返回对象
		new Person() {
			@Override
			public void hi() {
				System.out.println("匿名内部类重写了 hi方法...");
			}
			@Override
			public void ok(String str) {
				super.ok(str);
			}
		}.ok("jack");

		
	}
}

class Person {	//类
	public void hi() {
		System.out.println("Person hi()");
	}

	public void ok(String str) {
		System.out.println("Person ok()" + str);
	}
}

//抽象类/接口
