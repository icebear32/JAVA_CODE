public class VarScope01 {
	public static void main(String[] args) {
		
	}
}

class Cat {
	//全局变量：也就是属性，作用域为整个类体 Cat类：cry eat 等方法使用属性
	//属性在定义时，可以直接赋值
	int age = 10;	//指定的值是 10

	//全局变量可以不赋值，直接使用，因为有默认值。
	double weight;	//默认值是0.0

	//局部变量必须赋值后，才能使用，因为没有默认值。
	public void hi() {
		//int num;	//全局变量不赋值，编译时报错
		int num = 1;
		//String address;	//全局变量不赋值，编译时报错
		String addrees = "外面的猫";
		System.out.println("num=" + num);
		System.out.println("addrees=" + addrees);
		System.out.println("weight=" + weight);
	}

	public void cry() {
		//1.局部变量一般是指在成员方法中定义的变量
		//2.n 和 name 就是局部变量
		//3.n 和 name 的作用域在 cry方法中
		int n = 10;
		String name = "jack";
		System.out.println("在 cry 中使用属性 age = " + age);	//没报错
	}

	public void eat() {
		System.out.println("在 eat 中使用属性 age = " + age);	//没报错
		//System.out.println("在 eat 中使用属性 cry = " + cry);	//报错
	}
}
