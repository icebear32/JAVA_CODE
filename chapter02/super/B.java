public class B extends A {
	//访问父类的属性，但不能访问父类的private属性
	//super.属性名;
	public void hi() {
		//System.out.println(super.n1 + " " + super.n2 + " " + super.n3 + " " + super.n4);
		//super.n4 提示报错
		System.out.println(super.n1 + " " + super.n2 + " " + super.n3);
	}
	
	//访问父类的方法，不能访问父类的 private 方法
	//super.方法名(参数列表);
	public void ok() {
		super.test100();
		super.test200();
		super.test300();
		//super.test400();	//不能访问父类 private 方法
	}
	
	//访问父类的构造器
	//super(参数列表);
	//只能放在构造器的第一句，只能出现一句!
	
	//不是构造器
//	public void hello() {
//		super();
//	}
	
	public B() {
		//super();
		//super("jack");
		super("tom", 10);
	}
}
