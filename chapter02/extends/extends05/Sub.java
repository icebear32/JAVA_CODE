public class Sub extends Base {	//子类
	//当父类 Base 注释无参构造器后，Sub子类的构造器会出现报错
	//因为没有调用的默认无参构造器
	//所以用 super 加上 Base 定义的有参构造器
	public Sub() {	//构造器
		super("smith", 10);
		System.out.println("子类 Sub() 被调用...");
	}
	
	//当创建子类对象时，不管使用子类的哪个构造器，默认情况下总会去调用父类的无参构造器
	public Sub(String name) {
		super("tom", 30);
		System.out.println("子类 Sub(String name ) 构造器被调用...");
	}

}
