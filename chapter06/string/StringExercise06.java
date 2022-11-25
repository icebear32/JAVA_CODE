public class StringExercise06 {
	public static void main(String[] args) {
		String s1 = "ygh";	//s1 指向池中的 "ygh"
		String s2 = "java";	//s2 指向池中的 "java"
		String s5 = "yghjava";	//s5 指向池中的 "yghjava"
		String s6 = (s1 + s2).intern();	//s6指向池中的 "yghjava"
		System.out.println(s5 == s6);	//true
		System.out.println(s5.equals(s6));	//true
	}
}
