public class Object03{
	public static void main(String[] args){
		Person p1 = new Person();
		p1.age = 10;
		p1.name = "小明";
		Person p2 = p1;	//把 p1 赋值给 p2，让 p2 指向 p1
		System.out.println(p2.age);	
		//p2.age 是什么?
		//10
	}
}

class Person {
	String name;
	int age;
}

class Car{
	String name;	//属性，成员变量，字段，filed
	double price;
	String color;
	String[] master;	//属性可以是基本数据类型，也可以是引用类型(对象，数组)
}
