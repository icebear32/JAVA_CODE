public class Method12 {
	public static void main(String[] args) {
		Person p = new Person();
		p.name = "milan";
		p.age = 100;
		//创建tools
		MyTools tools  = new MyTools();
		Person p2 = tools.copyPerson(p);

		//到此P和P2是Person对象，但是是两个独立的对象,属性相同
		System.out.println("p的属性 age = " + p.age + " 名字 = " + p.name);
		System.out.println("p2的属性 age = " + p2.age + " 名字 = " + p2.name);
		//可以同 对象比较  看看对象是否是同一个对象
		System.out.println(p == p2);	//false
		System.out.println(p == p);	//true
	}
}

class Person {
	String name;
	int age;
}

class MyTools {
	//编写一个方法copyPerson，可以复制一个Person对象，返回复制的对象。克隆对象,
	//注意要求得到新对象和原来的对象是两个独立的对象，只是他们的属性相同
	//
	//1.方法的返回类型 Person
	//2.方法的名字 copyPerson
	//3.方法的形参 (Person P)
	//4.方法体，创建一个新对象，并复制属性，返回即可
	
	public Person copyPerson(Person p) {
		//创建一个新的对象
		Person p2 = new Person();
		p2.name = p.name;	//把原来对象的名字赋给p2.name
		p2.age = p.age;		//把原来对象的年龄赋给p2.age

		return p2;
	} 
}
