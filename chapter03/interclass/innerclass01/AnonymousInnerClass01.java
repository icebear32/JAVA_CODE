public class AnonymousInnerClass01 {
	public static void main(String[] args) {
		Outer07 outer07 = new Outer07();
		outer07.method();
	}
}

class Outer07 {	//外部类
	private int n1 = 10;
	public void method() {	//方法
		//基于接口的匿名内部类
		//1.需求:想使用IA接口,并创建对象
		//2.传统方式，是写一个类，实现该接口,并创建对象
		//3.需求是 Tiger 类只是使用一次，以后再不使用
		IA tiger = new Tiger();
		tiger.cry();

		IA Dog = new Dog();
		Dog.cry();
	}
}

interface IA {	//接口
	public void cry();
}

class Tiger implements IA {
	@Override 
	public void cry() {
		System.out.println("老虎叫唤...");
	}
}

class Dog implements IA {
	@Override
	public void cry() {
		System.out.println("小狗汪汪叫...");
	}
	
}

class Father {	//普通类
	public Father(String name) {	//构造器
	}

	public void test() {	
	}
}
