public class Method10 {
	public static void main(String[] args) {
		//测试
		B b = new B();

		Person p = new Person();
		p.name = "jack";
		p.age = 10;

		b.test200(p);
		//如果test200 执行的是 p = null，测试的结果是？
		System.out.println("main 的 p.age = " + p.age);	//	10
		//测试的结果是：10
		//p=null，意味着test的p不再指向0x11,指向空，test的age=0，name=null
		//最后main输出p=10，是因为main的p指向0x11的地址不与test的冲突
	}
}

class Person {
	String name;
	int age;
}

class B {
	public void test200(Person p) {
		//p.age = 1000;	//修改对象属性
		//思考 - 执行以下语句会怎么样？
		p  = null;
	}
}
