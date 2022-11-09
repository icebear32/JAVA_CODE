public class StaticExercise02 {
	public static void main(String[] args) {
		System.out.println("Number of total is " + Person.getTotalPerson());	//0，没有进行到加加操作

		Person p1 = new Person();	
		System.out.println("Number of total is " + Person.getTotalPerson());	//1，创建对象时调用构造器，进行加加操作，所以total = 1
	}
}

class Person {
	private int id;
	private static int total = 0;

	public static int getTotalPerson() {
		//id++;	//错误，类方法不能访问非静态成员
		return total;
	}

	public Person() {	//构造器
		total++;
		id = total;
	}
}
