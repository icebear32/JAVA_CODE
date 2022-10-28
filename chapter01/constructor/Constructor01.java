public class Constructor01 {
	public static void main(String[] args) {
		Person p1 = new Person("smith",80);		
		System.out.println("p1信息如下");
		System.out.println("p1对象 name = " + p1.name);
		System.out.println("p1对象 age = " + p1.age);
	}
}

//在创建人类的对象时．就直接指定这个对象的年龄和姓名
class Person {
	String name;
	int age;
	//构造器
	//1. 构造器没有返回值,也不能军void
	//2. 构造器的名称和类Person—样
	///3. (String pName, int pAge) 是构造器形参列表，规则和成员方法一样
	public Person(String pName, int pAge) {
		System.out.println("构造器被调用，完成对象属性初始化");
		name = pName;
		age = pAge;
	}
}
