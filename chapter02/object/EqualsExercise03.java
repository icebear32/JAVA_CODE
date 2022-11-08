public class EqualsExercise03 {
	public static void main(String[] args) {
		int it = 65;
		float f1 = 65.0f;
		System.out.println("65 和 65.0f 是否相等? " + (it == f1));	//T

		char ch1 ='A' ; 
		char ch2 = 12;
		System.out.println("65 和 ‘A’ 是否相等? " + (it == ch1));	//T
		System.out.println("12 和 ch2 是否相等? " + (12 == ch2));	//T

		String str1 = new String("hello");
		String str2 = new String("hello");
		System.out.println("str1 和 str2是否相等? " + (str1 == str2));
		System.out.println("str1 是否 equals str2? " + (str1.equals(str2)));
		//System.out.println("hello" == new java.sql.Date());	//编译器直接报错。类型不同
	}
}
