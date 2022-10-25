public class Method11 {
	public static void main(String[] args) {
		//测试
		B b = new B();

		Person p = new Person();
		p.name = "jack";
		p.age = 10;

		b.test200(p);
		//test200 执行的是 p = new Person(); 结果是？
		System.out.println("main 的 p.age = " + p.age);	//10
		//结果是：10
		//因为 test200 创建新的对象，就是指向新的对象
		//更改对象不会对 main 的对象冲突，就不会发生变化
		//所以还是打印 main 指向的对象 p 的 age = 10
	}
}

class Person {
	String name;
	int age;
}

class B {
	public void test200(Person p) {
		//p.age = 1000;	//修改对象属性
		p = new Person();
		p.name = "tom";
		p.age = 99;
	}
}
