public class Method09 {
	public static void main(String[] args) {
		//测试
		B b = new B();

		Person p = new Person();
		p.name = "jack";
		p.age = 10;

		b.test200(p);
		System.out.println("main 的 p.age = " + p.age);	//	1000
	}
}

class Person {
	String name;
	int age;
}

class B {
	public void test200(Person p) {
		p.age = 1000;	//修改对象属性
	}
}
