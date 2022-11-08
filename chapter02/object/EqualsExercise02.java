public class EqualsExercise02 {
	public static void main(String[] args) {
			Person p1 = new Person();
		p1.name = "hello";

		Person p2 = new Person();
		p2.name = "hello";

		System.out.println(p1 == p2);	//false
		System.out.println(p1.name.equals(p2.name));	//true
		System.out.println(p1.equals(p2));	//false
	
		String s1 = new String("world");	
		String s2 = new String("world");	
	
		System.out.println(s1.equals(s2));	//true
		System.out.println(s1 == s2);	//false
	}
}

class Person {	//Person 类
	public String name;
}
