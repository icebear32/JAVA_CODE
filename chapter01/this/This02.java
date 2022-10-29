public class This02 {
	public static void main(String[] args) {
		Dog dog1 = new Dog("大壮", 3);
		dog1.info();	
		System.out.println("main：dog1.hashCode是：" + dog1.hashCode());	//使用hashCode() 查看对象的情况
	}
}

class Dog {	//类
	String name;
	int age;
	
	public Dog(String name, int age) {	//构造器
		//this.name 就是当前对象的属性 name
		this.name = name;
		//this.age 就是当前对象的属性 age
		this.age = age;		
		
		System.out.println("构造器：this.hashCode是：" + this.hashCode());	//使用hashCode() 查看对象的情况
	}

	public void info() {
		System.out.println("info：this.hashCode是：" + this.hashCode());	//使用hashCode() 查看对象的情况
	}	
}
