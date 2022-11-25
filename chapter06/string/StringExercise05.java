public class StringExercise05 {
	public static void main(String[] args) {
		String s1 = "hello";
		s1 = "haha";
		//创建了几个对象？ ==》 两个

		String a = "hello" + "abc";
		//创建了几个对象？ ==》 只有一个对象
		//String a = "hello" + "abc";
		//==> 优化等价 String a = "helloabc";
		//编译器会做一个优化，判断创建的常量池对象，是否有引用指向
		
		String a = "hello";	//创建 a 对象
		String b = "abc";	//创建 b 对象
		//创建了几个对象？ ==》 三个对象
		//
		//底层：
		//1.先创建一个 StringBuilder sb = StringBuilder)
		//2.执行 sb.append("hello");
		//3. sb.append( "abc");
		//4.String c = sb.toString();
		//最后其实是 c 指向堆中的对象(String) value[] -> 常量池中"helloabc"
		String c = a + b;
		String d = "helloabc";	//指向常量池"helloabc"
		System.out.println(c == d);	//真假？false

		String e = "hello" + "abc";	//指向常量池"helloabc"
		System.out.println(d == e);	//真假？true
	}
}
