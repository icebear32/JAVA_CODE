public class StringExercise02 {
	public static void main(String[] args) {
		String a = "ygh";	//指向常量池的 "ygh"
		String b = new String("ygh");	//指向堆中对象

		System.out.println(a.equals(b));	//true
		System.out.println(a == b);	//false

		//当调用intern方法时，如果池已经包含一个等于此 String对象的字符串(用equals(Object)方法确定)，
		//则返回池中的字符串。否则,将此 String对象添加到池中，并返回此String对象的引用
		//
		//1) b.intern()方法最终返回的是常量池的地址（对象)
		System.out.println(a == b.intern());	//true
		System.out.println(b == b.intern());	//false
	}
}
