public class StaticExercise03 {
	public static void main(String[] args) {
		Person.setTotalPerson(3);
		new Person();	//最后 total 的值就是4

		Person.m();	//4
	}
}

class Person {
	private int id;
	private static int total = 0;

	public static void setTotalPerson(int total) {
		//this.total = total;	//错误，因为在static方法中，不可以使用this关键字
		Person.total = total;	//静态方法的形参 total 赋值给Person类的静态成员 total
	}

	public Person() {	//构造器
		total++;	//静态成员 total 加加
		id = total;	//静态成员 total 赋值给 id
	}

	//编写一个方法，输出 total 的值
	public static void m() {
		System.out.println("total 的值=" + total);
	}
}
