public class Sub extends Base {	//子类
	public Sub() {	//构造器
		//super();	//默认调用父类的无参构造器，写不写都一样执行的
		System.out.println("子类 Sub() 被调用...");
	}
	
	//当创建子类对象时，不管使用子类的哪个构造器，默认情况下总会去调用父类的无参构造器
	public Sub(String name) {
		System.out.println("子类 Sub(String name ) 构造器被调用...");
	}

}
