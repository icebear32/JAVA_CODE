public class MemberInnerClass01 {
	public static void main(String[] args) {
		Outer01 outer01 = new Outer01();
		outer01.t1();
	}
}

class Outer01 {	//外部类
	private int n1 = 10;
	public String name = "张三";
	
	//1. 可以直接访问外部类的所有成员，包含私有的
	//2. 可以添加任意访问修饰符(public、protected、默认、private)，
	//因为它的地位就是一个成员
	class  Inner01 {	//成员内部类
		public void say() {
			//可以直接访问外部类的所有成员，包含私有的
			System.out.println("n1 = "  + n1 + " name = " + name);
		}
	}

	//写方法
	public void t1() {
		//使用成员内部类
		Inner01 inner01 = new Inner01();
		inner01.say();
	}
}
