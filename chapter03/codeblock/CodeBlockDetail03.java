public class CodeBlockDetail03 {
	public static void main(String[] args) {
		//普通代码块，在创建对象实例时，会被隐式的调用
		//
		//1.被创建一次，就会调用一次
		//DD dd1 = new DD();
		//DD dd2 = new DD();
		//输出的时
		//DD 的静态代码块1 被执行...
		//DD 普通代码块被执行...
		//DD 普通代码块被执行...
		//
		//2. 如果只是使用类的静态成员时，普通代码块并不会执行
		System.out.println(DD.n1);
		//输出的是：
		//DD 的静态代码块1 被执行...
		//888
		//
		//因为调用静态成员时，只是类加载，对象没有被创建，普通代码块不会被执行
	}
}

class DD {
	public static int n1 = 888;	

	//静态代码块
	static  {
		System.out.println("DD 的静态代码块1 被执行...");
	}
		
	//普通代码块，在new对象时，被调用，而且是每创建一个对象，就调用一次
	{
		System.out.println("DD 普通代码块被执行...");
	}
}
