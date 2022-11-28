public class StringBufferExercise01 {
	public static void main(String[] args) {
		String str = null;	//可以
		StringBuffer sb = new StringBuffer();
		/**
		 * 源码，底层 append() 方法调用的是 AbstractStringBuilder 的 appendNull
		 * StringBuffer 的 append 方法
		 * public synchronized StringBuffer append(String str) {
		 * 	toStringCache = null;
		 * 	super.append(str);
		 * 	return this;
		 * }
		 *
		 * StringBuffer 的父类 AbstractStringBuilder
		 * public AbstractStringBuilder append(String str) {
		 * 	if (str == null)
		 * 		return appendNull();
		 * 	int len = str.length();
		 * 	ensureCapacityInternal(count + len);
		 * 	str.getChars(0, len, value, count);
		 * 	count += len;
		 * 	return this;
		 * }
		 *
		 * AbstractStringBuilder 的 appendNull 方法
		 * private AbstractStringBuilder appendNull() {
		 *	int c = count;
		 *	ensureCapacityInternal(c + 4);
		 *	final char[] value = this.value;
		 *	value[c++] = 'n';
		 *	value[c++] = 'u';
		 *	value[c++] = 'l';
		 *	value[c++] = 'l';
		 *	count = c;
		 *	return this;
		 * }
		 *
		 */ 
		sb.append(str);	//最后是把 null 转变成 'n' 'u' 'l' 'l'
		System.out.println(sb.length());	//4

		System.out.println(sb);	//null
		StringBuffer sb1 = new StringBuffer(str);
		//str 在上面的操作之后仍然是 null，为空
		//看源码 得出 传入 str 运行之后
		//操作是 super(str.length() + 16);
		//相当于 super(null.length() + 16);
		//所以会报错，报空指针异常

		System.out.println(sb1);
	}
}
