public class Base {	//父类
	//4个属性
	public int n1 = 100;
	protected int n2 = 200;
	int n3 = 300;
	private int n4 = 400;
	
	public Base() {	//无参构造器
		System.out.println("base()...");
	}
	
	//父类提供一个 public 的方法，返回 n4
	public int getN4() {
		return n4;
	}
	
	public void test100() {
		System.out.println("test100()...");
	}
	
	protected void test200() {
		System.out.println("test200()...");
	}
	
	void test300() {
		System.out.println("test300()...");
	}
	
	private void test400() {
		System.out.println("test400()...");
	}
	
	//父类提供一个 public 的方法
	public void callTest400() {
		test400();
	}
}
