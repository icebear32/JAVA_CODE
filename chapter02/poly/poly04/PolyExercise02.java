public class PolyExercise02 {
	public static void main(String[] args) {
		Sub s = new Sub();
		System.out.println(s.count);
		s.display();

		Base b = s;
		System.out.println(b == s);
		System.out.println(b.count);	//b 的编译类型是 Base，所以 b.count = 10，输出10
		b.display();	//b 的运行类型时 Sub，所以调用 Sub 的display 方法，输出20
	}
}

class Base {	//父类
	int count = 10;
	public void display() {
		System.out.println(this.count);
	}
}

class Sub extends Base {	//子类
	int count = 20;
	public void display() {
		System.out.println(this.count);
	}
}
