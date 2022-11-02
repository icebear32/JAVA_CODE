public class ExtendsExercise02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		E e = new E();
		//输出：
		//C类的无参构造
		//D类的无参构造
		//hahahaD类的有参构造
		//E类的有参构造
	}

}

class C {	//C类
	public C() {
		System.out.println("C类的无参构造");
	}
}

class D extends C {	//D类继承C类
	public D() {
		System.out.println("D类的无参构造");
	}
	public D(String name) {
		System.out.println(name + "D类的有参构造");
	}
}

class E extends D {	//E类继承D类
	public E() {
		this("hello");
		System.out.println("E类的无参构造");
	}
	
	public E(String name) {
		super("hahaha");
		System.out.println("E类的有参构造");
	}
}