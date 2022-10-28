public class Constructor02 {
	public static void main(String[] args) {
		//—个类可以定义多个不同的构造器，即构造器重载
		Person p1 = new Person("king",40);	//第一个构造器	
		Person p2 = new Person("tom");	//第二个构造器		
	}
}

class Person {
	String name;
	int age;
	//第一个构造器
	public Person(String pName, int pAge) {
		name = pName;
		age = pAge;
	}
	//第二个构造器，至指定人名，不需要指定年龄
	public Person(String pName) {
		name = pName;
	}

	//构造器名和类名要相同
	//构造器没有返回值
	//public P(String pName) {}	//报错，因为系统认为是一个方法，而不是构造器，方法需要返回值
}
