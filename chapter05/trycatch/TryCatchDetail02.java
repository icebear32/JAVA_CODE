public class TryCatchDetail02 {
	public static void main(String[] args) {
		//有多个不同的异常错误，但是想把每个异常错误分开执行
		//可以使用多个 catch 分别捕获不同的异常，相应处理
		//要求子类异常要写在前面，父类异常写在后面
		try {
			Person person1 = new Person();
			person1 = null;
			System.out.println(person1.getName());	//NullPointerException
			int n1 = 10;
			int n2 = 0;
			int res1  = n1 / n2;	//ArithmeticException
		} catch (NullPointerException e) {
			System.out.println("空指针异常 = " + e.getMessage());
		} catch (ArithmeticException e) {
			System.out.println("算术异常 = " + e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		System.out.println("======================>");

		try {
			Person person2 = new Person();
			//person2 = null;
			System.out.println(person2.getName());	//NullPointerException
			int n3 = 10;
			int n4 = 0;
			int res2  = n3 / n4;	//ArithmeticException
		} catch (NullPointerException e) {
			System.out.println("空指针异常 = " + e.getMessage());
		} catch (ArithmeticException e) {
			System.out.println("算术异常 = " + e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}

class Person {
	private String name = "jack";

	public String getName() {
		return name;
	}
}
