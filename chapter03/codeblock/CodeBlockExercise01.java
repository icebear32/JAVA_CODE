public class CodeBlockExercise01 {
	public static void main(String[] args) {
		System.out.println("total = " + Person.total);
		System.out.println("total = " + Person.total);
		//输出的是：
		//in static block!
		//total = 100
		//total = 100
	}
}

class Person {
	public static int total;	//静态变量，在类加载时运行，并且只允许一次

	static {	//静态代码块，在类加载时运行，并且只允许一次
		total = 100;
		System.out.println("in static block!");
	}
}
