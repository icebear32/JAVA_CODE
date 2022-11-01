public class Sub extends Base {	//子类
	
	/* 细节：如果希望指定去调用父类的某个构造器，则显式的调用一下super(参数列表) */
	public Sub(String name, int age) {
		//1. 调用父类的无参构造器，或者什么也不写表示调用默认 super(); 
//		super();	//父类的无参构造器
//		System.out.println("子类 Sub() 构造器被调用...");
		
		//2. 调用父类的 Base(Strinig name)构造器
//		super("ygh");
//		System.out.println("子类 Sub(String name) 构造器被调用...");
		
		//3. 调用父类的 Base(STring name, int age) 构造器
		/* 细节：super在使用时,必须放在构造器第一行(super 只能在构造器中使用) */
		super("ich", 23);
		/* 细节：super() 和 this() 都只能放在构造器第一行，因此这两个方法不能共存在一个构造器 */
		//this("ygh");	//报错
		System.out.println("子类 Sub(String name, int age) 构造器被调用...");
	}
	
	public Sub() {	//构造器
		super("smith", 10);
		System.out.println("子类 Sub() 被调用...");
	}
	
	public Sub(String name) {
		super("tom", 30);
		System.out.println("子类 Sub(String name) 构造器被调用...");
	}

}
