public class TryCatchDetail03 {
	public static void main(String[] args) {
		try {
			int n1 = 10;
			int n2 = 0;
			int res = n1 / n2;
		} finally {
			System.out.println("执行力 finally...");
		}
		System.out.println("程序继续执行...");	//因为没有 try-catch 捕获异常处理，执行 finally，程序会直接崩掉/退出
	}
}
