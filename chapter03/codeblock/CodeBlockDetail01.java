public class CodeBlockDetail01 {
	public static void main(String[] args) {
		//类被加载的情况举例
		//
		//1.创建对象实例时（new）
		//AA aa1 = new AA();
		//输出的是：AA 的静态代码块1 被执行...
		//
		//2.创建子类对象实例，父类也会被加载，
		//而且父类先被加载，子类后被加载
		AA aa2 = new AA();
		//输出的是：
		//BB 的静态代码块1 被执行...
		//AA 的静态代码块1 被执行...
		//
		//3.使用类的静态成员时（静态属性，静态方法）
		System.out.println(Cat.n1);
		//输出的是：
		//Animal 的静态代码块1 被执行...
		//cat 的静态代码块1 被执行...
		//999
	}
}

class Animal {
	//静态代码块
	static  {
		System.out.println("Animal 的静态代码块1 被执行...");
	}
}

class Cat extends Animal {
	public static int n1 = 999;	//静态属性
	
	//静态代码块
	static  {
		System.out.println("cat 的静态代码块1 被执行...");
	}
}

class BB {
	//静态代码块
	static  {
		System.out.println("BB 的静态代码块1 被执行...");
	}
}

class AA extends BB {
	//静态代码块
	static  {
		System.out.println("AA 的静态代码块1 被执行...");
	}
}
