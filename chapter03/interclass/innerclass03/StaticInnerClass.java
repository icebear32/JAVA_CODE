public class StaticInnerClass {
	public static void main(String[] args) {
		//5.作用域：同其他的成员，为整个类体
		Outer02 outer02 = new Outer02();
		outer02.m1();
		
		//8.外部其他类 --- 访问 -----> 静态内部类
		//外部其他类 使用静态内部类
		//
		//方法1
		//因为静态内部类,是可以通过类名直接访问(前提是满足访问权限
		Outer02.Inner02 inner02 = new Outer02.Inner02();
		inner02.say();
		//Outer02.Inner06 inner06 = new Outer02.Inner06();	//错误: Inner06 在 Outer02 中是 private 访问控制
		//
		//方法2
		//编写一个方法，可以返回静态内部类的对象实例
		System.out.println("==========================");
		Outer02.Inner02 inner002 = outer02.getInner02();
		inner002.say();
	}
}

class Outer02 {	//外部类
	private int n1 = 10;
	private static String name = "张三";
	
	//Inner02 就是静态内部类
	//1.放在外部类的成员位置
	//2.使用 static 修饰
	//3.可以直接访问外部类的所有静态成员，包含私有的，但不能直接访问非静态成员
	static class Inner02 {
		private static String name = "ygh";	
	
		public void say() {
			//System.out.println(n1);	//报错，不可以访问非静态属性成员

			//System.out.println(name);
			//
			//9.如果外部类和静态内部类的成员重名时，
			//静态内部类访问的时，默认遵循就近原则，
			//如果想访问外部类的成员，
			//则可以使用(外部类名.成员)去访问
			System.out.println("静态内部类 的 name = " + name + "外部类的 name = " + Outer02.name);
		}
	}

	//4.可以添加任意访问修饰符(public、protected、默认、private)，因为它的地位就是一个成员
	public static class Inner03 {
		public void say() {
			System.out.println(name);
		
		}
	}
	protected static class Inner04 {
		public void say() {
			System.out.println(name);
		}
	}
	static class Inner05 {
		public void say() {
			System.out.println(name);
		}
	}
	private static class Inner06 {
		public void say() {
			System.out.println(name);
		}
	}

	//5.作用域：同其他的成员，为整个类体
	public void m1() {
		//7.外部类 --- 访问 ------> 静态内部类访问方式：创建对象，再访问
		Inner02 inner02 = new Inner02();
		inner02.say();
	}

	private static int i1 = 10;
	private int i2 = 20;
	private static void cry1() {}
	private void cry2() {}
	//6.静态内部类 --- 访问 ----> 外部类（比如：静态属性）[ 访问方式：直接访问所有静态成员 ]
	static class Inner07 {
		public void say() {
			System.out.println(i1);
			//System.out.println(i2);	//无法访问非静态属性成员
			cry1();
			//cry2();	//无法访问非静态方法
		}	
	}

	//返回类型是 Inner02
	public Inner02 getInner02() {
		return new Inner02();
	}	
}
