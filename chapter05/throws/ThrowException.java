public class ThrowException {
	public static void main(String[] args) {
		try {
			ReturnExceptionDemo.methodA();	//3.2执行完，抛出异常
		} catch (Exception e) {	//3.3进入catch
			System.out.println(e.getMessage());	//3.4 执行语句，输出 ReturnExceptionDemo的methodA()方法的throw new RuntimeException("制造异常");
;		}
		ReturnExceptionDemo.methodB();	//4.1
	}
}
//输出内容
//1.进入方法A
//2.用A方法的finally
//3.制造异常
//4.进入方法B
//5.调用B方法的finally

class ReturnExceptionDemo {
	static void methodA() {
		try {
			System.out.println("进入方法A");	//1

			throw new RuntimeException("制造异常");	//3.1finally比throw对象的优先级更高，所以先执行 finally 的程序，再 throw 对象，抛出异常
			//3.3
		} finally {
			System.out.println("用A方法的finally");	//2
		}
	}
	
	static void methodB() {
		try {
			System.out.println("进入方法B");	//4.2
			return;
		} finally {
			System.out.println("调用B方法的finally");	//5
		}
	}
}
