public class Object04{
	public static void main(String[] args){
		Person a = new Person();
		a.age = 10;
		a.name = "小明";
		Person b;
		b = a;
		System.out.println(b.name);	//小明
		b.age = 200;
		b = null;
		System.out.println(a.age);	//200
		System.out.println(b.age);	//发生异常
	}
}

class Person {
	String name;
	int age;
}
