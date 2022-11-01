public class Base {	//父类
	//4个属性
	public int n1 = 100;
	protected int n2 = 200;
	int n3 = 300;
	private int n4 = 400;
	
	public Base() {	//无参构造器
		System.out.println("父类 base() 被调用...");
	}
	
	public Base(String name, int age) {	//有参构造器
		System.out.println("父类 base(String name, int age) 被调用...");
	}
	
}
