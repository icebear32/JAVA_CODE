public class StringExercise01 {
	public static void main(String[] args) {
		String a = "abc";	//指向常量池
		String b = "abc";	//指向常量池
		System.out.println(a.equals(b));	//true
		System.out.println(a == b);	//true
	}
}
