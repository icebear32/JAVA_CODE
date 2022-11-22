public class TryCatchDetail01 {
	public static void main(String[] args) {
		try {
			String str1 = "ygh";
			int a1 = Integer.parseInt(str1);
			System.out.println("数字：" + a1);
		} catch (NumberFormatException e) {
			System.out.println("异常信息 = " + e.getMessage());
		}
		//如果异常发生了，则异常发生后面的代码不会执行，直接进入到 catch 块

		System.out.println("============================>");
		
		try {
			String str2 = "123";
			int a2 = Integer.parseInt(str2);
			System.out.println("数字：" + a2);
		} catch (NumberFormatException e) {
			System.out.println("异常信息 = " + e.getMessage());
		}
		//如果异常没有发生，则顺序执行 try 的代码块，不会进入到catch

		System.out.println("============================>");
		try {
			String str2 = "123";
			int a2 = Integer.parseInt(str2);
			System.out.println("数字：" + a2);
		} catch (NumberFormatException e) {
			System.out.println("异常信息 = " + e.getMessage());
		} finally {
			System.out.println("finally 代码块被执行...");
		}

		System.out.println("程序继续...");
	}
}
