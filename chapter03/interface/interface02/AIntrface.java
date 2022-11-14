public interface Ainterface {
	//写属性
	public int n1 = 10;
	
	//写方法
	//在接口中，抽象方法，可以省略 abstract 关键子（可写可不写，系统都认为时 抽象方法）
	public void h1();

	//在 jdk8 后，可以有默认实现方法，但是需要使用 default 关键字修饰
	//public void ok() {	//报错
	default public void ok() {	//可以
		System.out.println();
	}

	//在 jdk8 后，可以有静态方法
	//public void cry() {	//报错
	public static void cry() {	//可以
		System.out.println("cry()...");
	}
}
