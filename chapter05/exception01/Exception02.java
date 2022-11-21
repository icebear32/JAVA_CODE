public class Exception02 {
	public static void main(String[] args) {
		System.out.println("==========================================");
		//NullPointerException
		//空指针异常
		//当应用程序试图在需要对象的地方使用null时，抛出该异常
		try {
			String name1 = null;
			System.out.println(name1.length());
		} catch (Exception e) {
			e.printStackTrace();
			//System.out.println("出现异常的原因 = " + e.getMessage());       //输出异常信息
		}
		System.out.println("==========================================>");

		//ArithmeticException
		//数学运算异常
		//当出现异常的运算条件时，抛出此异常。例如，一个整数“除以零”时，抛出此类的一个实例
		int num1 = 10;
		int num2 = 0;
		try {
			int res = num1 / num2;
		} catch(Exception e) {
			e.printStackTrace();
			//System.out.println("出现异常的原因 = " + e.getMessage());	//输出异常信息
		}
		System.out.println("==========================================>");

		//ArraylndexOutOfBoundsException
		//数组下标越界异常
		//用非法索引访问数组时抛出的异常。如果索引为负或大于等于数组大小，则该索引为非法索引
		int[] arr = {1,2,3};
		try {
			for (int i = 0; i < arr.length + 1; i++) {
				System.out.println(arr[i]);
			}
		} catch (Exception e) {
			e.printStackTrace();
			//System.out.println("出现异常的原因 = " + e.getMessage());       //输出异常信息
		}
		System.out.println("==========================================>");

		//ClassCastException
		//类型转换异常
		//当试图将对象强制转换为不是实例的子类时，抛出该异常
		try {
			A b = new B();	//向上转型
			B b2 = (B)b;	//向下转型，这是是可以的

			C c2 = (C)b;	//这里报错 B 不能转成 C
;		} catch (Exception e) {
			e.printStackTrace();
			//System.out.println("出现异常的原因 = " + e.getMessage());       //输出异常信息
		}
		System.out.println("==========================================>");

		//NumberFormatException
		//数字格式不正确异常
		//当应用程序试图将字符串转换成一种数值类型，但该字符串不能转换为适当格式时，抛出该异常=>使用异常我们可以确保输入是满足条件数字.
		try {
			String name2 = "1234";
			//将 String 转成 int
			int num3 = Integer.parseInt(name2);	//可以，没报错

			String name3 = "ygh";
			//将 String 转成 int
			int num4 = Integer.parseInt(name3);	//不可以，报错
		} catch (Exception e) {
			e.printStackTrace();
			//System.out.println("出现异常的原因 = " + e.getMessage());       //输出异常信息
		}
		System.out.println("==========================================>");


		System.out.println("程序继续运行...");
	}
}

class A {}
class B extends A {}
class C extends A {}
