public class SingleTon02 {
	public static void main(String[] args) {
		//System.out.println(Cat.n1);
		//输出的是：
		//999
		//为什么没有 构造器被调用 输出？
		//虽然类已经被加载，但是没有创建 Cat 对象
		//
		//创建 cat 对象
		Cat instance1 = Cat.getInstance();
		System.out.println(instance1);
		//构造器被调用
		//Cat{name=小可爱'}

		//再次调用 getInstance
		Cat instance2 = Cat.getInstance();
		System.out.println(instance2);
		//输出的是：
		//Cat{name=小可爱'}
		//
		//因为上一次执行 cat 已经不等于空
		//不等于空就不会再创建一个对象
		//就会返回上一次得对象
	}
}

//希望在程序运行过程中，只能创建一个Cat对象
//使用单例模式
class Cat {
	private String name;
	public static int n1 = 999;
	private static Cat cat;

	//步骤：
	//1.构造器私有化
	//2.定义一个 static 得静态属性对象
	//3.提供一个 public 得 static 方法，可以返回一个 cat 对象
	//4.懒汉式，只有当用户使用 getInstance 方法时，才返回 cat 对象
	//后面再次调用时，会返回上次创建得 cat 对象
	//从而保证了单例
	
	private Cat(String name) {
		System.out.println("构造器被调用");
		this.name = name;
	}

	public static Cat getInstance() {
		if (cat == null) {	//如果还没有创建 cat 对象
			cat = new Cat("小可爱");
		}
		return cat;
	}

	@Override
	public String toString() {
		return "Cat{" + 
			"name=" + name + '\'' + 
			'}';
	}
}
