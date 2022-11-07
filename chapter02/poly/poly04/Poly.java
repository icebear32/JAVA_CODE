public class Poly {
	public static void main(String[] args) {
		//向上转型：父类的引用指向了子类的对象
		//语法：引用名 = new 子类类型();
		Animal animal = new Cat();
		Object obj = new Cat();	//可以，Object 也是 Cat 的父类
		
		//向上转型调用方法的规则如下：	
		//1.可以调用父类中的所有成员(需遵守访问权限)
		//2.但是不能调用子类的特有的成员
		//2.因为在编译阶段，能调用哪些成员，是山编译类型来决定的
		//animal.catchMouse();错误
		//4.最终运行效果看子类的具体实现，最终运行效果看子类的具体实现，即调用方法时，按照从子类开始查找方法
		//然后调用，规则和方法调用规则一致
		animal.eat();	//猫吃鱼
		animal.run();	//跑步
		animal.show();	//hello，你好
		animal.sleep();	//睡觉
		
		//父类 Animal 可以调用子类 Cat 的 catchMouse 方法
		//利用多态的向下转型
		//
		//1.语法：子类类型	引用名 = (子类类型)父类引用;
		//
		//cat 的编译类型时 Cat，运行类型时 Cat
		Cat cat = (Cat)animal;
		cat.catchMouse();	//猫抓老鼠 
		//2.要求父类的引用必须指向的是当前目标类型的对象
		//
		//Dog dog = (Dog)animal;	//问题：可以这样写吗？
		//不可以，因为 Dog 类 和 Cat类 不相关，不可以将猫强制转换成一只狗
		//编译不报错，运行代码，会报错
		
		System.out.println("ok~");
	}
}
