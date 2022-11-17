public class MemberInnerClass02 {
	public static void main(String[] args) {	//外部其他类
		Outer01 outer01 = new Outer01();
		outer01.t1();

		//6.外部其他类 --- 访问 ----> 成员内部类
		//
		//外部其他类，使用成员内部类的两种方式
		//
		//第一种方式：
		//outer01.new Inner01(); 相当于把 new Inner01() 当作事 outer01 成员
		Outer01.Inner01 inner01 = outer01.new Inner01();
		inner01.say();
		//
		//第二种方式：在外部类，编写一个方法，可以返回 Inner01 对象
		Outer01.Inner01 inner01Instance = outer01.getInner01Instance();
		inner01Instance.say();
	}
}

class Outer01 {	//外部类
	private int n1 = 10;
	public String name = "张三";

	private void hi() {
		System.out.println("hi() 方法");
	}
	
	class  Inner01 {	//成员内部类
		public double sal1 = 99.8;
		private  double sal2 = 88.9;

		private int n1 = 66;

		public void say() {
			//7.如果外部类和内部类的成员重名时，
			//内部类访问的话，默认遵循就近原则，
			//如果想访问外部类的成员，
			//则可以使用（外部类名.this.成员）去访问
			System.out.println("成员内部类 n1 = "  + n1 + " name = " + name + "外部类 n1 = " + Outer01.this.n1);
			//4.成员内部类 --- 访问 ----> 外部类（比如：属性） [ 访问方式:直接访问 ]
			hi();
		}
	}

	//外部其他类访问成员内部类的第二种方式
	//该方法返回一个 Inner01 的实例
	public Inner01 getInner01Instance() {
		return new Inner01();
	}

	//写方法
	public void t1() {
		//使用成员内部类
		Inner01 inner01 = new Inner01();
		inner01.say();
		
		//5.外部类 --- 访问 ------> 内部类
		//访问方式：创建对象，再访问
		//
		//创建成员内部类对象，然后使用相关的方法
		System.out.println(inner01.sal1);
		System.out.println(inner01.sal2);	//访问私有的也行
	}
}
