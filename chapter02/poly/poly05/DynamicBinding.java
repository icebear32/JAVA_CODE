public class DynamicBinding {
	public static void main(String[] args) {
		A a = new B();	//向上转型
		System.out.println(a.sum());	//没注释前的输出的是?	40
		//把子类的 sum() 方法注释后，输出的是？
		//a 调用 sum() 方法，发现子类没有，
		//因为继承机制，去父类找
		//所以去子类 B找 sum() 方法
		//但是子类的 sum() 方法被注释了
		//因此到父类找到 sum() 方法
		//但是 sum() 方法调用了 getI() 方法
		//问题是 父类 和 子类 都有 getI() 方法
		//现在该调用什么 父类 还是 子类的 getI() 方法
		//
		//动态绑定机制解决这个问题
		//注意点：当调用对象方法的时候，该方法会和该对象的内存地址/运行类型绑定
		//
		//因为 a 的编译类型是 A，运行类型是 B
		//所以到 父类 的 sum() 方法时，因为动态绑定机制，父类的sum() 方法去调用 子类 的 getI() 方法
		//
		//所以注释后的输出应该是 20 + 10 = 30

		System.out.println(a.sum1());	//没注释前的输出的是?	30
		//把子类的 sum1() 方法注释后，输出的是？
		//
		//注意点：当调用对象属性时，没有动态绑定机制，哪里声明，那里使用
		//
		//所以子类没有sum1()
		//去调用父类的 sum1()
		//因为对象属性 i 时没有动态绑定机制，
		//所以调用的时 父类的 i
		//
		//所以注释后的输出应该时 10 + 10 = 20
	}
}

class A {	//父类
	public int i = 10;
	public int sum() {
		return getI() + 10;
	}

	public int sum1() {
		return i + 10;
	}

	public int getI() {
		return i;
	}
}

class B extends A {	//子类
	public int i = 20;
	
	//public int sum() {
	//	return i + 20;
	//}

	public int getI() {
		return i;
	}

	//public int sum1(){
	//	return i + 10;
	//}
}
