public class Equals02 {
	public static void main(String[] args) {
		Integer integer1 = new Integer(1000);
		Integer integer2 = new Integer(1000);
		System.out.println(integer1 == integer2);	//false，地址不一样
		System.out.println(integer1.equals(integer2));	//true，内容相同

		String str1 = new String("hello");
		String str2 = new String("hello");
		System.out.println(str1 == str2);	//false，地址不一样，内容相同
		System.out.println(str1.equals(str2));	//true
	}
}
