public class Object02{
	public static void main(String[] args){
		//使用OOP面向对象解决
		//实例化一只猫【创建一只猫对象】
		//把创建的猫赋值给 cat1
		//cat1 就是一个对象
		Cat cat1 = new Cat();
		cat1.name = "小白";
		cat1.age = 3;
		cat1.color = "白色";

		//创建第二只猫，赋给 cat2
		//cat2 就是一个对象(猫对象)
		Cat cat2 = new Cat();
		cat2.name = "小花";
		cat2.age = 100;
		cat2.color = "花色";

		//怎么访问对象的属性
		System.out.println("第一只猫信息" + cat1.name + " " + cat1.age + " " + cat1.color);
		System.out.println("第二只猫信息" + cat2.name + " " + cat2.age + " " + cat2.color);
	}
}

//定义一个猫类 Cat -> 自定义的数据类型
class Cat {
	//属性
	String name;
	int age;
	String color;
}
