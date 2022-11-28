public class StringBuffer01 {
	public static void main(String[] args) {
		//1. StringBuffer 的直接父类是 AbstractStringBuilder
		//2. StringBuffer实现了 Serializable，即 StringBuffer的对象可以串行化
		//3. 在父类中 AbstractStringBuilder 有 属性 char[] value,不是final
		//   该value 数组存放行符串内容，引出存放在堆中的
		//4. StringBuffer是一个 final 类,不能被继承
		//5，因为 StringBuffer 字符内容是存在char[] value，所有在变化(增加/朋除)
		//   不用每次都更换地址(即不是每次创建新对象)，所以效率高于 String
		//
		StringBuffer sb = new StringBuffer("hello");
	}
}