public class AnonymousInnerClassDetail02 {
	public static void main(String[] args) {
		Outer01 outer01 = new Outer01();
		outer01.hi();
		System.out.println("main 方法 Outet01.this hashcode = " + outer01); 
	}
}

class Outer01 {
	private int n1 = 99;
	public void hi() {
		//创建一个基于类的匿名内部类
		//
		//不能添加访问修饰符，因为它的地位就是一个局部变量
		//Person p = public new Person() {	//不可以的
		//
		//作用域：仅仅在定义它的方法或代码块中 - 只能使用一次，用完就没了
		Person p = new Person() {
			private int n1 = 88;
			@Override
			public void hi() {
				//可以直接访问外部类的所有成员，包含私有的
				//System.out.println("匿名内部类直接访问外部类所有成员，比如：n1 = " + n1);	//n1 = 99
				//
				//如果外部类和匿名内部类的成员重名时，
				//匿名内部类访问的话，默认遵循就近原则，
				//如果想访问外部类的成员，
				//则可以使用（外部类名.this.成员）去访问
				System.out.println("访问的是匿名内部类的 n1  =" + n1);	//88
				//想要访问外部类的 n1，怎么做？
				System.out.println("匿名内部类直接访问外部类所有成员，比如：n1 = " + Outer01.this.n1);     //n1 = 99
				//Outer01.this 就是调用 f1 的对象
				System.out.println("匿名内部类 Outet01.this hashcode = " + Outer01.this); 

				System.out.println("匿名内部类重写了 hi方法");
			}
		};
		p.hi();	//动态绑定机制，找到匿名内部类里面的 hi 方法
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
