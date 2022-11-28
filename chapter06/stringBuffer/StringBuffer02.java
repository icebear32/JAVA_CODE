public class StringBuffer02 {
	public static void main(String[] args) {
		//构造器的使用
		//
		// StringBuffer 底层：
		// 	public StringBuffer() {
		//		super(16);	//super 传值给父类
		// 	}
		//
		// StringBuffer 父类底层：
		// 	AbStrctStringBuilder(int capacity) {
		//		value = new char[capacity];
		// 	}
		//
		// 1.创建一个大小为 16 的 char[]，用于存放字符内容
		StringBuffer StringVuffer = new StringBuffer();

		//底层：
		//	public StringBuffer(int capacity) {
		//		super(capacity);
		//	}	
		//
		//2.通过构造器指定 char[] 大小
		StringBuffer stringBuffer1 = new StringBuffer(100);

		//底层：
		//	public StringBuffer(String str) {
		//		super(str.length() + 16);
		//		append(str);
		//	}
		//
		//3.通过给一个 String 创建 StringBuffer,char[] 大小就是 str.length() + 16
		StringBuffer hello = new StringBuffer("hello");
	}
}