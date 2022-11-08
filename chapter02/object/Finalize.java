public class Finalize {
	public static void main(String[] args) {
		Car bnw = new Car("宝马");
		bnw = null;	
		//这是 car 对象就是一个垃圾，垃圾回收器就会回收（销毁）对象，
		//在销毁对象前，会调用该对象的 finalize 方法
		//可以在finalize中，写自己的业务逻辑代码(比如释放资源:数据库连接,或者打开文件..)
		//如果不重写 finalize,那么就会调用0bject类的 finalize，即默认处理
		//如果重写了finalize，就可以实现自己的逻辑
		//
		
		//代码运行并没有打印重写 finalize 的信息
		//垃圾回收器不是随时随地工作的
		//
		//垃圾回收机制的调用，是由系统来决定(即有自己的 GC 算法)，也可以通过 System.gc() 主动触发垃圾回收机制
		System.gc();	//主动调用垃圾回收器

		System.out.println("程序退出...");
			
	}
}	

class Car {
	private String name;

	public Car(String name) {
		this.name = name;
	}

	//重写 finalize
	@Override
	protected void finalize() throws Throwable {
		System.out.println("销毁 汽车 ");
		System.out.println("释放了某些资源");
	}
}
