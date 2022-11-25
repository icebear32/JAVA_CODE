public class StringExercise04 {
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.name = "ygh";
		Person p2 = new Person();
		p2.name = "ygh";
		
		System.out.println(p1.name.equals(p2.name));	//true
		System.out.println(p1.name == p2.name);		//true
		System.out.println(p1.name == "ygh");	//true

		String s1 = new String("abcd");	
		String s2 = new String("abcd");
		System.out.println(s1 == s2);	//false
	}
}

class Person {
	String name;
	public Person() {
		
	}
}
