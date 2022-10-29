public class This04 {
	public static void main(String[] args) {
		Person p1 = new Person("mary", 20);
		Person p2 = new Person("smith", 30);

		
		System.out.println("p1 和 p2 比较的结果 = " + p1.compareTo(p2));	
	}
}

/**
 * 定义Person类，里面有name、age属性，
 * 并提供compareTo比较方法,用于判断是否和另一个人相等，
 * 提供测试类TestPerson用于测试，
 * 名字和年龄完全一样，就返回true,否则返回false
 *
 * */
class Person {
	String name;
	int age;

	//构造器
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	//compareTo 比较方法
	public boolean compareTo(Person p) {
		//名字和年龄完全一样
		//if (this.name.equals(p.name) && this.age == p.age) {
		//	return true;
		//} else {
		//	return false;
		//}
		//
		//简化代码
		return this.name.equals(p.name) && this.age == p.age;
	}
}
