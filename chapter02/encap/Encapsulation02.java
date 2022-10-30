public class Encapsulation02 {

	public static void main(String[] args) {
		//如果使用构造器指定属性，那么定义的私有属性就是去效果
		Person smith = new Person("smith", 18, 5000);
		System.out.println("=====smith的信息=====");
		System.out.println(smith.info());

		System.out.println("=====00000=====");
		//将set方法写在构造器后，set方法会对私有属性产生效果
		Person tom = new Person("很长很长很长很长的名字", 500, 5000);
		System.out.println("=====tom的信息=====");
		System.out.println(tom.info());
	}
}

/**
 *
 * 编写程序，不能随便查看人的年龄,工资等隐私，并对设置的年龄进行合理的验证。
 * 年龄合理就设置，否则给默认年龄必须在1-120，
 * 年龄，工资不能直接查看，
 * name的长度在 2 - 6 字符
 *
 * */
class Person {
	public String name;	//名字 公开
	private int age;	//年龄 私有化
	private double salary;	//工资 私有化

	//有三个属性的构造器
	public Person() {
		
	}

	public Person(String name, int age, double salary) {
		//
		//this.name = name;
		//this.age = age;
		//this.salary = salary;
		//
		//可以将set方法写在构造器中，这样就可以保护私有属性
		setName(name);
		setAge(age);
		setSalary(salary);
	}

	//setXxx 和 getXxx
	//根据需求完善代码
	public String getName() {
		return name;
	}

	public void setName(String name) {
		//加入对数据的校验
		if (name.length() >= 2 && name.length() <= 6) {
			this.name = name;
		} else {
			System.out.println("名字长度不对，需要在 2 - 6 个字符之间，默认名字");
			this.name = "无名";
		}
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		//判断
		if (age >= 1 && age <= 120) {
			this.age = age;
		} else {
			System.out.println("你设置的年龄不对，年龄需要在 1 - 120 之间，给默认年龄 18");
			this.age = 18;	//给一个默认年龄
		}
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	//写一个方法，返回属性信息
	public String info() {
		return "信息为 name= " + name + " age = " + age + " 薪水 = " + salary;
	}
}
