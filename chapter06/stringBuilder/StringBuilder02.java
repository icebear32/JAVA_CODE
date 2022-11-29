public class StringBuilder02 {
	public static void main(String[] args) {
		System.out.println("StringBuffer =========================>");
		long startTime = 0L;
		long endTime = 0L;
		StringBuffer buffer = new StringBuffer("");
		startTime = System.currentTimeMillis();
		for (int i = 0; i < 30000; i++) {		//StringBuffer拼接 20000 次
			buffer.append(String.valueOf(i));
		}
		
		endTime = System.currentTimeMillis();
		System.out.println("StringBuffer的执行时间："  +(endTime - startTime));
		
		System.out.println("StringBuilder =========================>");
		StringBuilder builder = new StringBuilder("");
		startTime = System.currentTimeMillis();
		for (int i = 0; i < 30000; i++) {		//StringBuilder拼接 20000 次
			builder.append(String.valueOf(i));
		}
		endTime = System.currentTimeMillis();
		System.out.println("StringBuilder的执行时间：" + (endTime - startTime));
		
		System.out.println("String =========================>");
		String text = "";
		startTime = System.currentTimeMillis();
		for (int i = 0; i < 30000; i++) {		//StringBuilder拼接 20000 次
			text = text + i;
		}
		endTime = System.currentTimeMillis();
		System.out.println("String的执行时间：" + (endTime - startTime));	
	}
}
