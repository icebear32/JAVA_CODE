public class Poly02 {
	public static void main(String[] args) {
		BB bb = new BB();
		System.out.println(bb instanceof BB);	//输出的时真还是假？
		//true

		System.out.println(bb instanceof AA);	//输出的时真还是假？	
		//true

		AA aa = new BB();
		System.out.println(aa instanceof AA);	//输出的时真还是假？
		//true

		System.out.println(aa instanceof BB);	//输出的时真还是假？	
		//true

		Object obj = new Object();
		System.out.println(obj instanceof AA);	//false

		String str = "hello";
		//System.out.println(str instanceof AA);	//直接编译报错
		System.out.println(str instanceof Object);	//true
	}
}

class AA {}	//父类

class BB extends AA {}	//子类
