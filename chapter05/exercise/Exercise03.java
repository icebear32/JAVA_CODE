public class Exercise03 {
	public static void func() {
		try {
			throw new RuntimeException();	
			//2.finally 优先级 throw 对象高，先执行 finally 程序
			//4.throw异常对象，抛出异常
		} finally {
			System.out.println("B");	//3.输出 B
		}
	}

	public static void main(String[] args) {
		try {
			func();	//1.调用 func 方法
			System.out.println("A");
		} catch (Exception e) {	//5.捕获异常，输出 catch 语句
			System.out.println("C");	
		}

		System.out.println("D");	//6.最后程序运行输出该语句
	}
}

//输出结果：
//B
//C
//D
