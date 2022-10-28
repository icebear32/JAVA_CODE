public class VarScope03 {
	public static void main(String[] args) {
		T t1 = new T();
		t1.test();	//jack	//第一种跨类访问对象属性的方式

		Person p1 = new Person();
		t1.test2(p1);	//jack	//第二种跨类访问对象属性的方式
	}
}

class T {
	//全局变量/属性可以加修饰符(public protected private ... )
	private int age = 20;

	//全局变量/属性：可以被本类使用，或其他类使用(通过对象调用)
	public void test() {
		Person p1 = new Person();
		System.out.println(p1.name);	//jack
	}
	
	public void test2(Person p) {
		System.out.println(p.name);	//jack
	}
}

class Person {
        String name = "jack";
	
	public void say() {
		//局部变量不可以加修饰符
		//public String name = "king";	//报错
		String name = "king";
	}
}
