public class ExtendsExercise01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b = new B();
		//输出：
		//a
		//b name
		//b
	}

}

class A {
	A() {
		System.out.println("a");
	}
	A(String name) {
		System.out.println("a name");
	}
}

class B extends A {
	B() {
		this("abc");	//this 会执行到 B(String name) 方法
		System.out.println("b");
	}
	B(String name) {
		//隐藏了一个super();	//查找到 父类的 A() 方法
		System.out.println("b name");
	}
}
