public class This01 {
	public static void main(String[] args) {
		//Dog dog1 = new Dog("大壮", 3);
		//dog1.info();	
		//输出的不是 大壮 和 3 ，而是 null 和 0
		//
		Dog dog1 = new Dog("大壮", 3);
		dog1.info();	
	}
}

class Dog {	//类
	String name;
	int age;
	
	//public Dog(String dName, int dAge) {	//构造器
	//	name = dName;
	//	age = dAge;
	//}
	//
	// 如果我们构造器的形参，能够直接写成属性名，就更好了
	// 但是出现了一个问题，根据变量的作用域原则
	// 构造器的 name 是局部变量，而不是属性
	// 构造器的 age 是局部变量，而不是属性
	// ==>	引出this关键字来解决
	//
	//public Dog(String name, int age) {	//构造器
	//	name = name;	//null
	//	age = age;	//0
	//}
	public Dog(String name, int age) {	//构造器
		//this.name 就是当前对象的属性 name
		this.name = name;
		//this.age 就是当前对象的属性 age
		this.age = age;		//
	}

	public void info() {	//成员方法，输出属性 * 信息
		System.out.println(name + "\t" + age + "\t");
	}	
}
