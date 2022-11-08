public class EqualsExercise01 {
	public static void main(String[] args) {
		Person person1 = new Person("jack", 10, '男');	
		Person person2 = new Person("jack", 10, '男');

		//未进行 equals 方法重写
		//System.out.println(person1.equals(person2));	//输出为假，因为子类没有进行重写 equals 方法
		//所以要重写 Object 的 equals 方法

		//重写 equals 方法后
		System.out.println(person1.equals(person2));	//输出为真
	}
}

class Person {
	private String name;
	private int age;
	private char gender;

	//重写 Object 的 equals 方法
	public boolean equals(Object obj) {
		//判断如果比较的两个对象是同一个对象，则直接返回true
		if (this == obj) {
			return true;
		}

		//类型判断
		if (obj instanceof Person) {	//是 Person，才比较
			//进行 向下转型，因为需要得到 obj 的各个属性
			Person p = (Person)obj;
			return this.name.equals(p.name) && this.age ==p.age && this.gender == p.gender;
		}

		//如果不是 Person，则直接返回false
		return false;
	}
	
	public Person(String name, int age, char gender) {
		this.name = name;	
		this.age = age;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}
}
